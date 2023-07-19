# Large file reading challenge

Welcome in the recruitment challenge.
Write an application that, at the endpoint specified by you, returns the yearly average temperatures for a given city in the format array of objects with the following fields: year, averageTemperature.

## Assumptions

- CSV file with data is no less than 3GB in size.
- The file represents temperature measurements in the format city;yyyy-mm-dd HH:mm:ss.SSS;temp
- The content of the source file may change during the application's running

## Example source file
[example_file.csv](example_file.csv)


## Example response
```json
[
  {
	"year": "2021",
	"averageTemperature": 12.1
  },
  {
	"year": "2022",
	"averageTemperature": 11.1
  },
  {
	"year": "2023",
	"averageTemperature": 14.1
  }
]
```

## Requirements
- Source code should be placed in a public repository (e.g. GitHub, GitLab, Bitbucket)

## Tips
Feel free you use any libraries and technologies you want. You can use external services. We are interested in your approach and the way you solve the problem. We are also interested in your knowledge of the technologies you use.
