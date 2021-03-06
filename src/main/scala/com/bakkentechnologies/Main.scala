package com.bakkentechnologies

import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}

object Main {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf()
      .setMaster("local")
      .setAppName("propertypartner")
      .set("spark.driver.host", "localhost")
      .set("spark.testing.memory", "2147480000")

    val spark: SparkSession = new SparkSession
      .Builder()
      .config(conf)
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    var currency: String = "NOK"
    if (args.length > 0) currency = args(0)

    // ETL - Extract, Transform, Load
    val extracted: DataFrame = ETL.extract(spark, "account-transactions-manual-GBP.csv")
    ETL.transform(extracted, currency, 2019)
  }
}
