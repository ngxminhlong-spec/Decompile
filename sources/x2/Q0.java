package x2;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.C0590f1;
import com.google.android.gms.internal.ads.Qw;
import com.google.android.gms.internal.ads.Ur;
import k.C1748e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q0 extends S {
    public Ur c;
    public final C1748e d;

    /* renamed from: e, reason: collision with root package name */
    public final C0590f1 f15433e;

    /* renamed from: f, reason: collision with root package name */
    public final Qw f15434f;

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, com.google.android.gms.internal.ads.f1] */
    public Q0(C2066c0 c2066c0) {
        super(c2066c0);
        this.d = new C1748e(23, this);
        ?? obj = new Object();
        obj.f8672r = this;
        C2066c0 c2066c02 = (C2066c0) this.f1719a;
        obj.f8671q = new P0(obj, c2066c02, 0);
        c2066c02.f15573n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        obj.f8669o = elapsedRealtime;
        obj.f8670p = elapsedRealtime;
        this.f15433e = obj;
        this.f15434f = new Qw(this);
    }

    @Override // x2.S
    public final boolean i() {
        return false;
    }

    public final void j() {
        g();
        if (this.c == null) {
            this.c = new Ur(Looper.getMainLooper(), 1, false);
        }
    }
}
