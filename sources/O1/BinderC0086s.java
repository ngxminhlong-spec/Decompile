package O1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0086s extends AbstractBinderC1149s4 implements U {

    /* renamed from: o, reason: collision with root package name */
    public final H1.r f1381o;

    public BinderC0086s(H1.r rVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f1381o = rVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
            AbstractC1192t4.b(parcel);
            T(c0101z0);
        } else if (i4 == 2) {
            d();
        } else if (i4 == 3) {
            e();
        } else if (i4 == 4) {
            a();
        } else if (i4 != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // O1.U
    public final void T(C0101z0 c0101z0) {
        H1.r rVar = this.f1381o;
        if (rVar != null) {
            c0101z0.getClass();
            rVar.c();
        }
    }

    @Override // O1.U
    public final void a() {
        H1.r rVar = this.f1381o;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // O1.U
    public final void c() {
    }

    @Override // O1.U
    public final void d() {
        H1.r rVar = this.f1381o;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // O1.U
    public final void e() {
        H1.r rVar = this.f1381o;
        if (rVar != null) {
            rVar.a();
        }
    }
}
