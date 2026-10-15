package K1;

import H1.p;
import com.google.android.gms.internal.ads.FC;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1053a;

    /* renamed from: b, reason: collision with root package name */
    public int f1054b;
    public int c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f1055e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1056f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1057g;

    public c() {
        this.f1053a = false;
        this.f1054b = -1;
        this.c = 0;
        this.d = false;
        this.f1055e = 1;
        this.f1057g = false;
    }

    public /* synthetic */ c(c cVar) {
        this.f1053a = cVar.f1053a;
        this.f1054b = cVar.f1054b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.f1055e = cVar.f1055e;
        this.f1056f = (p) cVar.f1056f;
        this.f1057g = cVar.f1057g;
    }

    public c(FC fc) {
        this.f1056f = fc;
    }

    public void a(int i4) {
        this.f1053a = 1 == ((this.f1053a ? 1 : 0) | i4);
        this.f1054b += i4;
    }
}
