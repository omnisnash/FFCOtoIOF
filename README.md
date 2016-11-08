# FFCO to IOF
FFCO to IOF is a Java program used to convert the [French Orienteering Federation (FFCO)](http://www.ffcorientation.fr/) members list from CSV format to a set of valid [International Orienteering Federation (IOF)](http://orienteering.org/) XML files.

## Supported formats
Currently, the **OE2003** and **OE2010** formats are supported by the application.
Please note **the inputted CSV file must keep the header**, otherwise the first line of the file will be ignored.

## Exportation output
Two XML files are generated :
- One containing the organisations;
- Another containing the competitors.

These XML files respond to the [IOF-XML normalisation](http://www.orienteering.org/datastandard/IOF.xsd), which can be used in software like [MeOS](http://www.melin.nu/meos/en/).

## User guide
1. Select the members list;
2. The format should be automatically detected if the csv header is present;
3. Change the output location of generated files if needed (by default, the files are generated at the same location than the inputted members list file);
4. Click on the "Extract" button.

## Download
You can download the runnable Jar [here](https://gitlab.com/omnisnash/FFCOtoIOF/raw/master/FFCOtoIOF.jar).

A [Java 8 version](https://www.java.com/fr/download/) is required to run FFCO to IOF.




