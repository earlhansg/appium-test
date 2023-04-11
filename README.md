## Code

-  locate element for the firstImage for the ff reasons
   - assertion
   - swipeAction("firstImage", direction "left or right")
```java
WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
```
- before swipe Assertion
```java
String firstTimeVale = firstImage.getAttribute("focusable");
Assert.assertEquals("true", firstTimeVale);
```
- perform swipeAction("firstImage", direction "left or right")
```java
swipeAction(firstImage, "left");
```
- after swiper Assertion
```java
String secondTimeVale = firstImage.getAttribute("focusable");
Assert.assertEquals("false", secondTimeVale);
```
<img src="https://github.com/earlhansg/appium-test/blob/T4-Swipe/images/Swipe-1.png" style=" width:100% ; height:100% ">
