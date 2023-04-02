
# Performance Comparison of PDF Generation Libraries: wkhtmltopdf vs Puppeteer

## Introduction

In this blog post, we aim to compare the performance of two popular PDF generation libraries: **wkhtmltopdf** and **Puppeteer**. Our goal is to provide an in-depth analysis, which will help CTOs, experienced architects, and senior software engineers make informed decisions when selecting the most suitable library for their projects.

### Introducing wkhtmltopdf and Puppeteer Libraries
**wkhtmltopdf** is an open-source command-line tool that converts HTML documents into PDF files. It uses the WebKit rendering engine to create PDFs with high fidelity to the original HTML content. On the other hand, **Puppeteer** is a Node.js library that provides a high-level API to control headless Chrome or Chromium browsers. Puppeteer can also be used to generate PDFs from web pages, leveraging the powerful rendering capabilities of Chrome.

### Importance of PDF Generation in Web Applications
PDF generation is a crucial aspect of web development, particularly when dealing with documentation, reports, invoices, or other content that requires a consistent and portable format. Efficient PDF generation ensures seamless user experience, accurate document rendering, and optimal resource utilization.

## Methodology

### Description of the Test Environment
The tests were conducted on a machine with the following specifications:
- Operating System: Linux Mint 20.3 Cinnamon
- RAM: 30.6 GiB
- CPU: AMD Ryzen 7 PRO 4750U with Radeon Graphics × 8

We used Docker to set up isolated environments for each library. The Dockerfiles for both libraries can be found in the GitHub repository:

- Dockerfile-wkhtmltopdf (1.2G)
- Dockerfile-puppeteer (2.0G)

### Overview of Conducted Tests
We performed two types of tests to evaluate the performance of wkhtmltopdf and Puppeteer using the k6 load testing tool:

#### Sequential Tests
In these tests, we generated PDFs one after another, simulating a single-user scenario. We used the `sequential.js` script to run 10 iterations with 1 virtual user. The goal of these tests was to assess the performance of each library under controlled conditions, without any additional load.

```shell
# Running sequential tests with loadtest.sh
docker run --rm -i --network="host" grafana/k6 run -e URL=http://localhost:3001/generate-pdf-wkhtmltopdf - <sequential.js
docker run --rm -i --network="host" grafana/k6 run -e URL=http://localhost:3000/generate-pdf-puppeteer - <sequential.js
```

#### Concurrent Requests Tests
In these tests, we simulated multiple concurrent users requesting PDF generation simultaneously. We used the `concurrent.js` script to run the tests for 30 seconds with 5 virtual users. This allowed us to evaluate the libraries' performance under load and assess their ability to handle multiple requests concurrently.

```shell
# Running concurrent tests with loadtest.sh
docker run --rm -i --network="host" grafana/k6 run -e URL=http://localhost:3001/generate-pdf-wkhtmltopdf - <concurrent.js
docker run --rm -i --network="host" grafana/k6 run -e URL=http://localhost:3000/generate-pdf-puppeteer - <concurrent.js
```

### Discussion of Performance Metrics Used for Evaluation
We used several performance metrics to evaluate the libraries:

1. **Response Time**: The time taken to generate a single PDF or to process multiple concurrent requests, as reported by k6.
2. **RAM Usage**: The memory consumption of each library during PDF generation, monitored using the `stats.sh` script and Docker stats.
3. **CPU Usage**: The CPU utilization during the PDF generation process, also monitored using the `stats.sh` script and Docker stats.

These metrics allowed us to compare the efficiency of each library and determine their suitability for different use cases.

## Results

### Results Table

| Test Scenario    | wkhtmltopdf Average Response Time | Puppeteer Average Response Time | wkhtmltopdf Average CPU Usage | Puppeteer Average CPU Usage | wkhtmltopdf Average RAM Usage | Puppeteer Average RAM Usage |
|------------------|-----------------------------------|---------------------------------|-------------------------------|-----------------------------|-------------------------------|-----------------------------|
| Sequential       | 251.62 ms                         | 227.07 ms                       | 7.94%                         | 45.60%                      | 34.92 MiB                     | 85.32 MiB                   |
| Concurrent       | 253.41 ms                         | 231.34 ms                       | 39.28%                        | 452.07%                     | 34.65 MiB                     | 203.27 MiB                  |

### RAM Usage Comparison

In the sequential tests, the average RAM usage for wkhtmltopdf was 34.92 MiB, while Puppeteer consumed more RAM, with an average of 85.32 MiB. During the concurrent tests, the average RAM usage for wkhtmltopdf was 34.65 MiB, and for Puppeteer, it was significantly higher at 203.27 MiB.

### CPU Usage Comparison

In the sequential tests, the average CPU usage for wkhtmltopdf was 7.94%, whereas Puppeteer had a much higher average CPU usage of 45.60%. During the concurrent tests, the average CPU usage for wkhtmltopdf was 39.28%, and for Puppeteer, it was significantly higher at 452.07%.

### Performance Analysis during PDF Generation

While Puppeteer had faster response times in both sequential and concurrent tests, it consumed considerably more CPU and RAM resources compared to wkhtmltopdf. Moreover, to run Puppeteer, an additional 800MB of disk space is required for the Docker image due to the extra libraries and files needed for proper execution. This indicates that the minimal improvement in response time may not be worth the significantly higher resource consumption.



## Conclusions

### Performance of wkhtmltopdf in Comparison to Puppeteer

In our tests, we observed that Puppeteer generally provided faster response times compared to wkhtmltopdf. However, this performance advantage came at the cost of higher CPU and RAM usage. Specifically, Puppeteer's CPU and RAM usage was significantly higher in both sequential and concurrent tests.

### Recommendations for Different Use Cases

Based on our findings, we recommend the following for different use cases:

- For projects with a limited budget for server resources or those prioritizing lower resource consumption, wkhtmltopdf may be a more suitable choice due to its lower CPU and RAM usage.
- For projects where fast response times are crucial and resource consumption is less of a concern, Puppeteer may be a better option, especially if the number of concurrent PDF generation requests is expected to be high.

It is important to evaluate the specific requirements and constraints of each project to determine which tool is best suited for the task.

### Potential Limitations and Areas for Further Research

Our tests were limited to specific scenarios and may not cover all possible use cases. In addition, the tests were conducted on a single machine with a specific hardware configuration, which could influence the results. It is also worth noting that our tests focused on average values, which might not fully represent the performance characteristics of the tools under varying conditions.

Further research could explore additional scenarios, such as varying levels of concurrency or different HTML content types, to provide a more comprehensive understanding of the performance and resource consumption of both wkhtmltopdf and Puppeteer. Additionally, conducting tests on different hardware configurations and platforms could help in understanding how these factors influence the performance of both tools.

## Summary

### Overall Assessment of Both Libraries

In our performance comparison, we found that Puppeteer generally offers faster response times than wkhtmltopdf, but at the cost of higher CPU and RAM usage, as well as additional disk space requirements for the Docker image. Both libraries have their merits and limitations depending on the specific use case and requirements of a project.

### Recommendations for Decision-Makers Choosing a Library

When deciding which library to use, it is crucial to evaluate the needs and constraints of the project. If fast response times and high concurrency support are the top priorities, Puppeteer might be the better choice. However, if lower resource consumption, including CPU, RAM, and disk space, is the primary concern, wkhtmltopdf may be more suitable. It is essential to consider whether the marginal improvement in response time is worth the substantially increased resource usage that comes with using Puppeteer.

## Additional Resources and References

### Links to Libraries Documentation

For more information on each library, please refer to their official documentation:

- [wkhtmltopdf Documentation](https://wkhtmltopdf.org/usage/wkhtmltopdf.txt)
- [Puppeteer Documentation](https://pptr.dev/)

### Data Sources and Tools Used in the Research

The data presented in this article was obtained using custom-built testing scripts that simulated the PDF generation process for both wkhtmltopdf and Puppeteer. The tests were conducted on a machine with the following hardware configuration: 8-Core CPU and 32GB of RAM. The resource usage data was collected using Docker and Docker Stats, while response times were recorded using built-in time measurement functions. Additionally, the k6 load testing tool was used for concurrent test scenarios.

For the full set of test scripts and data, please refer to our [GitHub repository](https://github.com/Kyotu-Technology/kyotu/tree/main/articles/2-pdf-benchmark).

Please note that the results presented in this article are specific to the test scenarios and hardware configurations used in our research, and may not be applicable to all use cases or environments.