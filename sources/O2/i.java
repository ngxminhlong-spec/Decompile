package O2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f1435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m mVar, int i4) {
        super(mVar);
        this.f1434e = i4;
        this.f1435f = mVar;
    }

    @Override // O2.j
    public final float a() {
        float f4;
        float f5;
        switch (this.f1434e) {
            case 0:
                m mVar = this.f1435f;
                f4 = mVar.f1451h;
                f5 = mVar.f1452i;
                break;
            case 1:
                m mVar2 = this.f1435f;
                f4 = mVar2.f1451h;
                f5 = mVar2.f1453j;
                break;
            default:
                return this.f1435f.f1451h;
        }
        return f4 + f5;
    }
}
