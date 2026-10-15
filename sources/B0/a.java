package B0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    /* renamed from: b, reason: collision with root package name */
    public String f45b;

    public /* synthetic */ a() {
        this.f44a = 0;
    }

    public /* synthetic */ a(f fVar) {
        this.f44a = 1;
        this.f45b = fVar.f75p;
    }

    public /* synthetic */ a(f fVar, byte b4) {
        this.f44a = 2;
        this.f45b = fVar.f75p;
    }

    public /* synthetic */ a(String str, int i4) {
        this.f44a = i4;
        this.f45b = str;
    }

    public String toString() {
        switch (this.f44a) {
            case 3:
                return "<" + this.f45b + '>';
            default:
                return super.toString();
        }
    }
}
