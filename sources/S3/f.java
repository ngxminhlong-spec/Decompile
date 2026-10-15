package S3;

import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class f implements d, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final int f1788o;

    public f(int i4) {
        this.f1788o = i4;
    }

    @Override // S3.d
    public final int a() {
        return this.f1788o;
    }

    public final String toString() {
        i.f1791a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        e.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
