package x2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15458a;

    /* renamed from: b, reason: collision with root package name */
    public final C2066c0 f15459b;

    public U(X0 x02) {
        this.f15458a = 0;
        this.f15459b = x02.f15491l;
    }

    public /* synthetic */ U(C2066c0 c2066c0, int i4) {
        this.f15458a = i4;
        this.f15459b = c2066c0;
    }

    public void a(Bundle bundle, String str) {
        String uri;
        C2066c0 c2066c0 = this.f15459b;
        T t4 = c2066c0.f15567h;
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        if (c2066c0.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        C2066c0.g(t4);
        t4.f15455t.c(uri);
        C2066c0.g(t4);
        Q q4 = t4.f15456u;
        c2066c0.f15573n.getClass();
        q4.b(System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b() {
        switch (this.f15458a) {
            case 0:
                C2066c0 c2066c0 = this.f15459b;
                boolean z4 = false;
                try {
                    m2.b a4 = m2.c.a(c2066c0.f15562a);
                    if (a4 == null) {
                        K k3 = c2066c0.f15568i;
                        C2066c0.i(k3);
                        k3.f15402n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        c2066c0 = c2066c0;
                    } else {
                        int i4 = a4.b("com.android.vending", 128).versionCode;
                        c2066c0 = i4;
                        if (i4 >= 80837300) {
                            z4 = true;
                            c2066c0 = i4;
                        }
                    }
                } catch (Exception e4) {
                    K k4 = c2066c0.f15568i;
                    C2066c0.i(k4);
                    k4.f15402n.b(e4, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z4;
            default:
                C2066c0 c2066c02 = this.f15459b;
                if (TextUtils.isEmpty(c2066c02.f15563b)) {
                    K k5 = c2066c02.f15568i;
                    C2066c0.i(k5);
                    if (Log.isLoggable(k5.q(), 3)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public boolean c() {
        T t4 = this.f15459b.f15567h;
        C2066c0.g(t4);
        return t4.f15456u.a() > 0;
    }

    public boolean d() {
        if (!c()) {
            return false;
        }
        C2066c0 c2066c0 = this.f15459b;
        c2066c0.f15573n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        T t4 = c2066c0.f15567h;
        C2066c0.g(t4);
        return currentTimeMillis - t4.f15456u.a() > c2066c0.f15566g.m(null, B.f15280R);
    }
}
