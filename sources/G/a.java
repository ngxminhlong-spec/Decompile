package G;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends Writer {

    /* renamed from: p, reason: collision with root package name */
    public final StringBuilder f757p = new StringBuilder(128);

    /* renamed from: o, reason: collision with root package name */
    public final String f756o = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f757p;
        if (sb.length() > 0) {
            Log.d(this.f756o, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c = cArr[i4 + i6];
            if (c == '\n') {
                a();
            } else {
                this.f757p.append(c);
            }
        }
    }
}
