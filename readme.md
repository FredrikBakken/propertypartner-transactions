# :house_with_garden: [Property Partner](https://www.propertypartner.co?r=Fredrik01) Transactions
Scala (Apache Spark) application for helping with getting an overview of the performance and to fill out the norwegian tax information related to the property dividends and transactions.

## Library Versions
- Scala: `v2.12.11`
- sbt: `v1.3.4`
- Apache Spark: `v3.0.0-preview2`

## Getting Started
1. Clone project
2. Create a directory at root level `/reports`
3. Add the transactions `.csv`
4. Execute the application

The application can be launched with a custom input argument for currency to convert the dividends and transactions to. Default currency (when no argument provided) is `NOK`. 
