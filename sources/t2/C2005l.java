package t2;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.Jn;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2005l extends WebView {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f14914r = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f14915o;

    /* renamed from: p, reason: collision with root package name */
    public final C1995b f14916p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14917q;

    public C2005l(C2006m c2006m, Handler handler, C1995b c1995b) {
        super(c2006m);
        this.f14917q = false;
        this.f14915o = handler;
        this.f14916p = c1995b;
    }

    public final void a(String str, String str2) {
        this.f14915o.post(new Jn(25, this, str + "(" + str2 + ");"));
    }
}
