package com.jws.samples.cloudwatch;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.cloudwatchlogs.CloudWatchLogsClient;
import software.amazon.awssdk.services.cloudwatchlogs.model.DescribeLogStreamsRequest;
import software.amazon.awssdk.services.cloudwatchlogs.model.GetLogEventsRequest;
import software.amazon.awssdk.services.cloudwatchlogs.model.LogStream;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static java.lang.System.out;

public class GetLogEvents {
    public static void main(String[] args) {
        // Create a CloudWatchLogClient
        CloudWatchLogsClient cloudWatchLogsClient = CloudWatchLogsClient.builder()
                .region(Region.US_EAST_2)
                .build();

        Calendar calendar = Calendar.getInstance();
        long endTime = calendar.getTimeInMillis();
        calendar.set(Calendar.DAY_OF_MONTH, -200);
        // Designate logGroupName and logStream you want to get logs from
        // Assume only one stream name exist, this is not always the case

        DescribeLogStreamsRequest describeLogStreamsRequest = DescribeLogStreamsRequest.builder()
                .logGroupName("/aws/lambda/book-test")
                .build();

        List<LogStream> logStreams = cloudWatchLogsClient.describeLogStreams(describeLogStreamsRequest).logStreams();

        logStreams.forEach(logStream -> {
            out.print(new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date(logStream.creationTime())) + "  ");
            out.println(logStream.logStreamName());

            GetLogEventsRequest getLogEventsRequest = GetLogEventsRequest.builder()
                    .logGroupName("/aws/lambda/book-test")
                    .logStreamName(logStream.logStreamName())
                    .startFromHead(true)
                    .build();

            int logLimit = cloudWatchLogsClient.getLogEvents(getLogEventsRequest).events().size();
            for (int c = 0; c < logLimit; c++) {
                // Prints the messages to the console
                out.print(cloudWatchLogsClient.getLogEvents(getLogEventsRequest).events().get(c).message());
            }
        });

        out.println("Successfully got CloudWatch log events!");
        // snippet-end:[cloudwatch.java2.get_logs.main]
    }
}
