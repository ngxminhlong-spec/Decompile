package l;

import k.InterfaceC1743D;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1754B extends Y {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ F f13579x;
    public final /* synthetic */ I y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754B(I i4, I i5, F f4) {
        super(i5);
        this.y = i4;
        this.f13579x = f4;
    }

    @Override // l.Y
    public final InterfaceC1743D b() {
        return this.f13579x;
    }

    @Override // l.Y
    public final boolean c() {
        I i4 = this.y;
        if (i4.getInternalPopup().b()) {
            return true;
        }
        i4.f13624t.m(i4.getTextDirection(), i4.getTextAlignment());
        return true;
    }
}
