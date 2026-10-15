package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hs extends Js {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Xj f5515t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hs(Xj xj, C1384xi c1384xi, CharSequence charSequence) {
        super(c1384xi, charSequence);
        this.f5515t = xj;
    }

    @Override // com.google.android.gms.internal.ads.Js
    public final int a(int i4) {
        return i4 + 1;
    }

    @Override // com.google.android.gms.internal.ads.Js
    public final int b(int i4) {
        CharSequence charSequence = this.f5931q;
        int length = charSequence.length();
        Bs.C(i4, length);
        while (i4 < length) {
            if (((C1437ys) this.f5515t.f7687p).a(charSequence.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }
}
