/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cn.json.quicknCore.quickn.utils.freeimage4j;

public class FreeImageWrapper {
  public static void FreeImage_Initialise(boolean load_local_plugins_only) {
    FreeImageWrapperJNI.FreeImage_Initialise(load_local_plugins_only);
  }

  public static String FreeImage_GetVersion() {
    return FreeImageWrapperJNI.FreeImage_GetVersion();
  }

  public static String FreeImage_GetCopyrightMessage() {
    return FreeImageWrapperJNI.FreeImage_GetCopyrightMessage();
  }

  public static SWIGTYPE_p_FIMULTIBITMAP FreeImage_OpenMultiBitmap(int fif, String filename, boolean create_new, boolean read_only, boolean keep_cache_in_memory, int flags) {
    long cPtr = FreeImageWrapperJNI.FreeImage_OpenMultiBitmap(fif, filename, create_new, read_only, keep_cache_in_memory, flags);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIMULTIBITMAP(cPtr, false);
  }

  public static boolean FreeImage_CloseMultiBitmap(SWIGTYPE_p_FIMULTIBITMAP bitmap, int flags) {
	return FreeImageWrapperJNI.FreeImage_CloseMultiBitmap(SWIGTYPE_p_FIMULTIBITMAP.getCPtr(bitmap), flags);
  }

  public static int FreeImage_GetPageCount(SWIGTYPE_p_FIMULTIBITMAP bitmap) {
    return FreeImageWrapperJNI.FreeImage_GetPageCount(SWIGTYPE_p_FIMULTIBITMAP.getCPtr(bitmap));
  }

  public static void FreeImage_AppendPage(SWIGTYPE_p_FIMULTIBITMAP bitmap, SWIGTYPE_p_FIBITMAP data) {
    FreeImageWrapperJNI.FreeImage_AppendPage(SWIGTYPE_p_FIMULTIBITMAP.getCPtr(bitmap), SWIGTYPE_p_FIBITMAP.getCPtr(data));
  }

  public static void FreeImage_InsertPage(SWIGTYPE_p_FIMULTIBITMAP bitmap, int page, SWIGTYPE_p_FIBITMAP data) {
    FreeImageWrapperJNI.FreeImage_InsertPage(SWIGTYPE_p_FIMULTIBITMAP.getCPtr(bitmap), page, SWIGTYPE_p_FIBITMAP.getCPtr(data));
  }

  public static void FreeImage_DeletePage(SWIGTYPE_p_FIMULTIBITMAP bitmap, int page) {
    FreeImageWrapperJNI.FreeImage_DeletePage(SWIGTYPE_p_FIMULTIBITMAP.getCPtr(bitmap), page);
  }

  public static boolean FreeImage_MovePage(SWIGTYPE_p_FIMULTIBITMAP bitmap, int target, int source) {
	return FreeImageWrapperJNI.FreeImage_MovePage(SWIGTYPE_p_FIMULTIBITMAP.getCPtr(bitmap), target, source);
  }

  public static int FreeImage_GetFileType(String filename, int size) {
    return FreeImageWrapperJNI.FreeImage_GetFileType(filename, size);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_Load(int fif, String filename, int flags) {
    long cPtr = FreeImageWrapperJNI.FreeImage_Load(fif, filename, flags);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static boolean FreeImage_Save(int fif, SWIGTYPE_p_FIBITMAP dib, String filename, int flags) {
	return FreeImageWrapperJNI.FreeImage_Save(fif, SWIGTYPE_p_FIBITMAP.getCPtr(dib), filename, flags);
  }

  public static int FreeImage_GetColorsUsed(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_GetColorsUsed(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static int FreeImage_GetBPP(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_GetBPP(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static int FreeImage_GetWidth(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_GetWidth(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static int FreeImage_GetHeight(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_GetHeight(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static int FreeImage_GetPitch(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_GetPitch(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static void SetPaletteColor(SWIGTYPE_p_FIBITMAP dib, int index, int color) {
    FreeImageWrapperJNI.SetPaletteColor(SWIGTYPE_p_FIBITMAP.getCPtr(dib), index, color);
  }

  public static int GetPaletteColor(SWIGTYPE_p_FIBITMAP dib, int index) {
	return FreeImageWrapperJNI.GetPaletteColor(SWIGTYPE_p_FIBITMAP.getCPtr(dib), index);
  }

  public static boolean FreeImage_IsTransparent(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_IsTransparent(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_Allocate(int width, int height, int bpp, int red_mask, int green_mask, int blue_mask) {
    long cPtr = FreeImageWrapperJNI.FreeImage_Allocate(width, height, bpp, red_mask, green_mask, blue_mask);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static void FreeImage_Unload(SWIGTYPE_p_FIBITMAP dib) {
    FreeImageWrapperJNI.FreeImage_Unload(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_Rescale(SWIGTYPE_p_FIBITMAP dib, int dst_width, int dst_height, int filter) {
    long cPtr = FreeImageWrapperJNI.FreeImage_Rescale(SWIGTYPE_p_FIBITMAP.getCPtr(dib), dst_width, dst_height, filter);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_MakeThumbnail(SWIGTYPE_p_FIBITMAP dib, int max_pixel_size, boolean convert) {
    long cPtr = FreeImageWrapperJNI.FreeImage_MakeThumbnail(SWIGTYPE_p_FIBITMAP.getCPtr(dib), max_pixel_size, convert);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static boolean FreeImage_AdjustGamma(SWIGTYPE_p_FIBITMAP dib, double gamma) {
	return FreeImageWrapperJNI.FreeImage_AdjustGamma(SWIGTYPE_p_FIBITMAP.getCPtr(dib), gamma);
  }

  public static boolean FreeImage_AdjustBrightness(SWIGTYPE_p_FIBITMAP dib, double percentage) {
	return FreeImageWrapperJNI.FreeImage_AdjustBrightness(SWIGTYPE_p_FIBITMAP.getCPtr(dib), percentage);
  }

  public static boolean FreeImage_AdjustContrast(SWIGTYPE_p_FIBITMAP dib, double percentage) {
	return FreeImageWrapperJNI.FreeImage_AdjustContrast(SWIGTYPE_p_FIBITMAP.getCPtr(dib), percentage);
  }

  public static boolean FreeImage_Invert(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_Invert(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_RotateClassic(SWIGTYPE_p_FIBITMAP dib, double angle) {
    long cPtr = FreeImageWrapperJNI.FreeImage_RotateClassic(SWIGTYPE_p_FIBITMAP.getCPtr(dib), angle);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_RotateEx(SWIGTYPE_p_FIBITMAP dib, double angle, double x_shift, double y_shift, double x_origin, double y_origin, boolean use_mask) {
    long cPtr = FreeImageWrapperJNI.FreeImage_RotateEx(SWIGTYPE_p_FIBITMAP.getCPtr(dib), angle, x_shift, y_shift, x_origin, y_origin, use_mask);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static boolean FreeImage_FlipHorizontal(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_FlipHorizontal(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static boolean FreeImage_FlipVertical(SWIGTYPE_p_FIBITMAP dib) {
	return FreeImageWrapperJNI.FreeImage_FlipVertical(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ConvertTo4Bits(SWIGTYPE_p_FIBITMAP dib) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ConvertTo4Bits(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ConvertTo8Bits(SWIGTYPE_p_FIBITMAP dib) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ConvertTo8Bits(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ConvertToGreyscale(SWIGTYPE_p_FIBITMAP dib) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ConvertToGreyscale(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ConvertTo16Bits555(SWIGTYPE_p_FIBITMAP dib) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ConvertTo16Bits555(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ConvertTo16Bits565(SWIGTYPE_p_FIBITMAP dib) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ConvertTo16Bits565(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ConvertTo24Bits(SWIGTYPE_p_FIBITMAP dib) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ConvertTo24Bits(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ConvertTo32Bits(SWIGTYPE_p_FIBITMAP dib) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ConvertTo32Bits(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ColorQuantize(SWIGTYPE_p_FIBITMAP dib, int quantize) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ColorQuantize(SWIGTYPE_p_FIBITMAP.getCPtr(dib), quantize);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_Threshold(SWIGTYPE_p_FIBITMAP dib, short T) {
    long cPtr = FreeImageWrapperJNI.FreeImage_Threshold(SWIGTYPE_p_FIBITMAP.getCPtr(dib), T);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_Dither(SWIGTYPE_p_FIBITMAP dib, int algorithm) {
    long cPtr = FreeImageWrapperJNI.FreeImage_Dither(SWIGTYPE_p_FIBITMAP.getCPtr(dib), algorithm);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_ConvertFromRawBits(java.nio.ByteBuffer bits, int width, int height, int pitch, int bpp, int red_mask, int green_mask, int blue_mask, boolean topdown) {
    long cPtr = FreeImageWrapperJNI.FreeImage_ConvertFromRawBits(bits, width, height, pitch, bpp, red_mask, green_mask, blue_mask, topdown);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

  public static void FreeImage_ConvertToRawBits(java.nio.ByteBuffer bits, SWIGTYPE_p_FIBITMAP dib, int pitch, int bpp, int red_mask, int green_mask, int blue_mask, boolean topdown) {
    FreeImageWrapperJNI.FreeImage_ConvertToRawBits(bits, SWIGTYPE_p_FIBITMAP.getCPtr(dib), pitch, bpp, red_mask, green_mask, blue_mask, topdown);
  }

  public static java.nio.ByteBuffer FreeImage_GetBits(SWIGTYPE_p_FIBITMAP dib) {
    return FreeImageWrapperJNI.FreeImage_GetBits(SWIGTYPE_p_FIBITMAP.getCPtr(dib));
  }

  public static int GetPixelColor(SWIGTYPE_p_FIBITMAP dib, int x, int y) {
    return FreeImageWrapperJNI.GetPixelColor(SWIGTYPE_p_FIBITMAP.getCPtr(dib), x, y);
  }

  public static short GetPixelIndex(SWIGTYPE_p_FIBITMAP dib, int x, int y) {
    return FreeImageWrapperJNI.GetPixelIndex(SWIGTYPE_p_FIBITMAP.getCPtr(dib), x, y);
  }

  public static void SetPixelColor(SWIGTYPE_p_FIBITMAP dib, int x, int y, int color) {
	FreeImageWrapperJNI.SetPixelColor(SWIGTYPE_p_FIBITMAP.getCPtr(dib), x, y, color);
  }

  public static void SetPixelIndex(SWIGTYPE_p_FIBITMAP dib, int x, int y, short index) {
	FreeImageWrapperJNI.SetPixelIndex(SWIGTYPE_p_FIBITMAP.getCPtr(dib), x, y, index);
  }

  public static boolean FreeImage_IsLittleEndian() {
	return FreeImageWrapperJNI.FreeImage_IsLittleEndian();
  }

  public static SWIGTYPE_p_FIBITMAP FreeImage_Copy(SWIGTYPE_p_FIBITMAP dib, int left, int top, int right, int bottom) {
    long cPtr = FreeImageWrapperJNI.FreeImage_Copy(SWIGTYPE_p_FIBITMAP.getCPtr(dib), left, top, right, bottom);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FIBITMAP(cPtr, false);
  }

}