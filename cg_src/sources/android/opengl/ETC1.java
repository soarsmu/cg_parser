package android.opengl;

import java.nio.Buffer;
/* loaded from: gencallgraphv3.jar:android-4.1.1.4.jar:android/opengl/ETC1.class */
public class ETC1 {
    public static final int ENCODED_BLOCK_SIZE = 8;
    public static final int DECODED_BLOCK_SIZE = 48;
    public static final int ETC_PKM_HEADER_SIZE = 16;
    public static final int ETC1_RGB8_OES = 36196;

    public static native void encodeBlock(Buffer buffer, int i, Buffer buffer2);

    public static native void decodeBlock(Buffer buffer, Buffer buffer2);

    public static native int getEncodedDataSize(int i, int i2);

    public static native void encodeImage(Buffer buffer, int i, int i2, int i3, int i4, Buffer buffer2);

    public static native void decodeImage(Buffer buffer, Buffer buffer2, int i, int i2, int i3, int i4);

    public static native void formatHeader(Buffer buffer, int i, int i2);

    public static native boolean isValid(Buffer buffer);

    public static native int getWidth(Buffer buffer);

    public static native int getHeight(Buffer buffer);

    public ETC1() {
        throw new RuntimeException("Stub!");
    }
}