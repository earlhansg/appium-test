## Start & Stop Appium Server programmatically?

- In order to run tests with Appium, you need to start an Appium server which acts as a bridge between the mobile device and the automation script. The Appium server listens to commands from the automation script and executes them on the device. Therefore, it is important to ensure that the Appium server is running before running the automation script.
- By handling the starting and stopping of the Appium server programmatically, you can automate this process and ensure that the server is started and stopped correctly each time. This can save time and reduce the risk of errors or inconsistencies in the testing process.
<img src="https://github.com/earlhansg/appium-test/blob/T1-ConfigureBase/images/ConfigureBase-1.png" style=" width:100% ; height:100% ">
- This project's test scripts will extend this Hooks to avoid redundancies of code
<img src="https://github.com/earlhansg/appium-test/blob/T1-ConfigureBase/images/ConfigureBase-2.png" style=" width:100% ; height:100% ">
