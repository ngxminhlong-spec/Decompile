package H1;

import O1.R0;
import com.google.android.gms.internal.ads.C0602fD;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f880a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f881b;
    public boolean c;

    public p(R0 r02) {
        this.f880a = r02.f1287o;
        this.f881b = r02.f1288p;
        this.c = r02.f1289q;
    }

    public C0602fD a() {
        if (this.f880a || !(this.f881b || this.c)) {
            return new C0602fD(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
