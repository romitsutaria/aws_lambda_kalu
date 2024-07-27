### AWS lambda function to read SQS Message

This application will produce jar file which has capability to read the aws sqs message.In this application we have added the dependency of Maven shade plugin, shade plugin is getting used for generating single/uber jar which container all the code + depencency into it.

Execute `mvn clean package` maven command to generate the jar file.
> Location of generated jar file will be at --> ./target/kalu_aws_lambda-1.0.jar
