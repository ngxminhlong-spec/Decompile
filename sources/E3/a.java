package E3;

import android.util.Log;
import java.io.InputStream;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final Runtime f719f = Runtime.getRuntime();

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f720a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f721b = new byte[262144];
    public int c = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f722e = true;
    public boolean d = false;

    public a(InputStream inputStream) {
        this.f720a = inputStream;
    }

    public final int a(int i4) {
        int i5 = this.c;
        int i6 = 0;
        if (i4 <= i5) {
            int i7 = i5 - i4;
            this.c = i7;
            byte[] bArr = this.f721b;
            System.arraycopy(bArr, i4, bArr, 0, i7);
            return i4;
        }
        this.c = 0;
        while (i6 < i4) {
            InputStream inputStream = this.f720a;
            int skip = (int) inputStream.skip(i4 - i6);
            if (skip > 0) {
                i6 += skip;
            } else if (skip != 0) {
                continue;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                i6++;
            }
        }
        return i6;
    }

    public final void b(int i4) {
        byte[] bArr = this.f721b;
        if (i4 > bArr.length) {
            int max = Math.max(bArr.length * 2, i4);
            Runtime runtime = f719f;
            long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
            if (!this.f722e || max >= maxMemory) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
            } else {
                try {
                    byte[] bArr2 = new byte[max];
                    System.arraycopy(this.f721b, 0, bArr2, 0, this.c);
                    this.f721b = bArr2;
                } catch (OutOfMemoryError unused) {
                    Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                    this.f722e = false;
                }
            }
            i4 = Math.min(i4, this.f721b.length);
        }
        while (true) {
            int i5 = this.c;
            if (i5 >= i4) {
                return;
            }
            int read = this.f720a.read(this.f721b, i5, i4 - i5);
            if (read == -1) {
                this.d = true;
                return;
            }
            this.c += read;
        }
    }
}
