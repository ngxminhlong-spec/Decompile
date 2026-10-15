package s3;

import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1981a implements q3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14800a;

    @Override // q3.a
    public final void a(Object obj, Object obj2) {
        switch (this.f14800a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                q3.e eVar = (q3.e) obj2;
                eVar.d(t3.e.f14954g, entry.getKey());
                eVar.d(t3.e.f14955h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
