package h0;

import android.content.Context;
import com.google.android.gms.internal.measurement.C1510e1;
import java.io.File;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697e implements g0.b {

    /* renamed from: o, reason: collision with root package name */
    public final Context f13109o;

    /* renamed from: p, reason: collision with root package name */
    public final String f13110p;

    /* renamed from: q, reason: collision with root package name */
    public final C1510e1 f13111q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13112r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f13113s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public C1696d f13114t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13115u;

    public C1697e(Context context, String str, C1510e1 c1510e1, boolean z4) {
        this.f13109o = context;
        this.f13110p = str;
        this.f13111q = c1510e1;
        this.f13112r = z4;
    }

    public final C1696d a() {
        C1696d c1696d;
        synchronized (this.f13113s) {
            try {
                if (this.f13114t == null) {
                    C1694b[] c1694bArr = new C1694b[1];
                    if (this.f13110p == null || !this.f13112r) {
                        this.f13114t = new C1696d(this.f13109o, this.f13110p, c1694bArr, this.f13111q);
                    } else {
                        this.f13114t = new C1696d(this.f13109o, new File(this.f13109o.getNoBackupFilesDir(), this.f13110p).getAbsolutePath(), c1694bArr, this.f13111q);
                    }
                    this.f13114t.setWriteAheadLoggingEnabled(this.f13115u);
                }
                c1696d = this.f13114t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1696d;
    }

    @Override // g0.b
    public final C1694b c() {
        return a().b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // g0.b
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        synchronized (this.f13113s) {
            try {
                C1696d c1696d = this.f13114t;
                if (c1696d != null) {
                    c1696d.setWriteAheadLoggingEnabled(z4);
                }
                this.f13115u = z4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
