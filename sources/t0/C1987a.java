package t0;

import android.os.Build;
import s0.C1970a;
import w0.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1987a extends AbstractC1989c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1987a(u0.d dVar, int i4) {
        super(dVar);
        this.f14837e = i4;
    }

    @Override // t0.AbstractC1989c
    public final boolean a(i iVar) {
        switch (this.f14837e) {
            case 0:
                return iVar.f15122j.f14081b;
            case 1:
                return iVar.f15122j.d;
            case 2:
                return iVar.f15122j.f14080a == 2;
            case 3:
                int i4 = iVar.f15122j.f14080a;
                return i4 == 3 || (Build.VERSION.SDK_INT >= 30 && i4 == 6);
            default:
                return iVar.f15122j.f14082e;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // t0.AbstractC1989c
    public final boolean b(Object obj) {
        boolean booleanValue;
        switch (this.f14837e) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 2:
                C1970a c1970a = (C1970a) obj;
                return Build.VERSION.SDK_INT >= 26 ? (c1970a.f14759a && c1970a.f14760b) ? false : true : true ^ c1970a.f14759a;
            case 3:
                C1970a c1970a2 = (C1970a) obj;
                return !c1970a2.f14759a || c1970a2.c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
        }
    }
}
