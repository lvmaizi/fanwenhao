package com.example.fanwenhao.java8.hbase;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

public class hbaseTest {
    public static void main(String[] args) throws Exception {
        //第一步，设置HBsae配置信息
        Configuration configuration = HBaseConfiguration.create();
        //hbase 服务器地址
        configuration.set("hbase.zookeeper.quorum","49.234.7.155");
        //设置"hbase.zookeeper.property.clientPort"的端口号为2181
        configuration.set("hbase.zookeeper.property.clientPort","2185"); //端口号
        // 取得一个数据库连接对象
        Connection connection = ConnectionFactory.createConnection(configuration);
        Admin admin = connection.getAdmin();
        TableName[] tableNames = admin.listTableNames();
        for (TableName tableName:tableNames){
            System.out.println(String.valueOf(tableName.getName()));
        }
        System.out.println(admin.tableExists(TableName.valueOf("users")));
        Table table = connection.getTable(TableName.valueOf("user"));
//        Put put = new Put(Bytes.toBytes("first"));
//        put.addColumn(Bytes.toBytes("info"),Bytes.toBytes("name"),Bytes.toBytes("fanwenhao"));
//        put.addColumn(Bytes.toBytes("info"),Bytes.toBytes("sex"),Bytes.toBytes("nan"));
//        put.addColumn(Bytes.toBytes("other"),Bytes.toBytes("test"),Bytes.toBytes("t1"));
//        table.put(put);
        Get get = new Get(Bytes.toBytes("first"));
        Result result = table.get(get);
        Cell[] cells = result.rawCells();
        for (Cell cell:cells){
            System.out.println("rowkey:" + Bytes.toString(CellUtil.cloneRow(cell))
                    + ",CF:" + Bytes.toString(CellUtil.cloneFamily(cell))
                    + ",CN:" + Bytes.toString(CellUtil.cloneQualifier(cell))
                    + ",VALUE:" + Bytes.toString(CellUtil.cloneValue(cell)));
        }
        if(admin!=null){
            admin.close();
        }

    }
}
