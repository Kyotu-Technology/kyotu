const express = require("express");
const puppeteer = require("puppeteer");
const app = express();
const port = 3000;

const htmlContent = `
<!DOCTYPE html>
<html>
<head>
  <title>PDF Test</title>
</head>
<body>
  <h1>Hello World</h1>
</body>
</html>
`;

app.get("/generate-pdf-puppeteer", async (req, res) => {
    const browser = await puppeteer.launch({ headless: true, args: ['--no-sandbox', '--disable-setuid-sandbox']});
    const page = await browser.newPage();
    await page.setContent(htmlContent);
    const pdfBuffer = await page.pdf({ format: "Letter" });

    res.contentType("application/pdf");
    res.send(pdfBuffer);

    await browser.close();
});

app.listen(port, () => {
    console.log(`Puppeteer PDF generation app listening at http://localhost:${port}`);
});
