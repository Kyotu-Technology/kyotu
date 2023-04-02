# articles-2-pdf-benchmark

This repository contains the benchmark tests, results, and related files for comparing the performance of two PDF generation libraries: wkhtmltopdf and Puppeteer.

## Test Environment
The tests were conducted on a machine with the following specifications:

- Linux Mint 20.3 Cinnamon
- RAM: 30.6 GiB
- CPU: AMD Ryzen 7 PRO 4750U with Radeon Graphics × 8

## Repository Structure

```bash
articles-2-pdf-benchmark
│
├── k6
│   ├── concurrent.js
│   ├── loadtests.sh
│   ├── sequential.js
│   └── stats.sh
│
├── Dockerfile-puppeteer
├── Dockerfile-wkhtmltopdf
├── puppeteer.js
├── puppeteer-package.json
├── wkhtmltopdf.js
└── wkhtmltopdf-package.json
```


### k6
This folder contains the k6 load test scripts and related files:

- `concurrent.js`: k6 load test script for concurrent requests.
- `loadtests.sh`: Shell script to run k6 load tests.
- `sequential.js`: k6 load test script for sequential requests.
- `stats.sh`: Shell script to gather Docker stats. 
 
### Dockerfiles and scripts
- `Dockerfile-puppeteer`: Dockerfile for creating a Puppeteer container.
- `Dockerfile-wkhtmltopdf`: Dockerfile for creating a wkhtmltopdf container.
- `puppeteer.js`: Puppeteer PDF generation script.
- `puppeteer-package.json`: Package.json for Puppeteer script.
- `wkhtmltopdf.js`: wkhtmltopdf PDF generation script.
- `wkhtmltopdf-package.json`: Package.json for wkhtmltopdf script.

## Usage
To run the benchmark tests, follow these steps:

1. Build the Docker containers for Puppeteer and wkhtmltopdf using the respective Dockerfiles.
2. Run the containers with PDF generation endpoints (`puppeteer.js` and `wkhtmltopdf.js`).
3. Run the k6 load tests using the `loadtests.sh` script.
4. Gather the Docker stats using the `stats.sh` script.
5. Analyze the results and compare the performance of both libraries.

## Contributing
If you have suggestions, improvements, or other contributions, feel free to submit a pull request or open an issue.

## License
This project is licensed under the MIT License.`