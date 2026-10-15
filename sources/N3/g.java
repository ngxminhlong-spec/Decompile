package N3;

import S3.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class g extends b implements S3.d {

    /* renamed from: r, reason: collision with root package name */
    public final int f1238r;

    public g(L3.d dVar) {
        super(dVar);
        this.f1238r = 2;
    }

    @Override // S3.d
    public final int a() {
        return this.f1238r;
    }

    @Override // N3.b
    public final String toString() {
        if (this.f1231o != null) {
            return super.toString();
        }
        i.f1791a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        S3.e.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
