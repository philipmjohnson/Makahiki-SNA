package makahikisna;

import static makahikisna.MakahikiSNA.*;

public class Color {
  
  private int redHue = 350;
  private int blueHue = 230;
  private int greenHue = 125;
  
  // Basic colors
  public int blue;
  public int white;
  public int black;
  public int green;
  public int red;
  
  public Color() {
    processing.colorMode(HSB, 360, 100, 100);
    this.black = processing.color(0, 0, 0);
    this.white = processing.color(0, 0, 100);  
    this.red = processing.color(redHue, 100, 100);
    this.green = processing.color(greenHue, 100, 100);
    this.blue = processing.color(blueHue, 100, 100);
  }
  
  public static int brighten(int color, int level) {
    float hue = processing.hue(color);
    float saturation = processing.saturation(color);
    float brightness = processing.brightness(color);
    saturation = ((saturation + level) > 100) ? saturation : (saturation + level);
    brightness = ((brightness + level) > 100) ? brightness : (brightness + level);
    return processing.color(hue, saturation, brightness);
  }
  
  public static int lighten(int color, int level) {
    float hue = processing.hue(color);
    float saturation = processing.saturation(color);
    float brightness = processing.brightness(color);
    saturation = ((saturation + level) < 0) ? saturation : (saturation - level);
    brightness = ((brightness + level) < 0) ? brightness : (brightness - level);
    return processing.color(hue, saturation, brightness);
  }
}
