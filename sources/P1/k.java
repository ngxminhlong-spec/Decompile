package P1;

import N1.n;
import O1.InterfaceC0051a;
import O1.r;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC1161sa;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.Sh;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k extends AbstractBinderC1161sa {

    /* renamed from: p, reason: collision with root package name */
    public final AdOverlayInfoParcel f1519p;

    /* renamed from: q, reason: collision with root package name */
    public final Activity f1520q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1521r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1522s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1523t = false;

    public k(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f1519p = adOverlayInfoParcel;
        this.f1520q = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void C0(Bundle bundle) {
        g gVar;
        boolean booleanValue = ((Boolean) r.d.c.a(AbstractC1066q6.N7)).booleanValue();
        Activity activity = this.f1520q;
        if (booleanValue && !this.f1523t) {
            activity.requestWindowFeature(1);
        }
        boolean z4 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z4 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1519p;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z4) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC0051a interfaceC0051a = adOverlayInfoParcel.f3867p;
            if (interfaceC0051a != null) {
                interfaceC0051a.D();
            }
            Sh sh = adOverlayInfoParcel.f3863I;
            if (sh != null) {
                sh.G0();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (gVar = adOverlayInfoParcel.f3868q) != null) {
                gVar.a0();
            }
        }
        V2.e eVar = n.f1204A.f1205a;
        b bVar = adOverlayInfoParcel.f3866o;
        if (V2.e.j(activity, bVar, adOverlayInfoParcel.f3874w, bVar.f1510w)) {
            return;
        }
        activity.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final boolean G2() {
        return false;
    }

    public final synchronized void K3() {
        try {
            if (this.f1522s) {
                return;
            }
            g gVar = this.f1519p.f3868q;
            if (gVar != null) {
                gVar.L2(4);
            }
            this.f1522s = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void M() {
        if (this.f1521r) {
            this.f1520q.finish();
            return;
        }
        this.f1521r = true;
        g gVar = this.f1519p.f3868q;
        if (gVar != null) {
            gVar.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void X1(InterfaceC1812a interfaceC1812a) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void b() {
        g gVar = this.f1519p.f3868q;
        if (gVar != null) {
            gVar.W2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void c1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f1521r);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void e3(int i4, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void j2(int i4, int i5, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void n() {
        g gVar = this.f1519p.f3868q;
        if (gVar != null) {
            gVar.q1();
        }
        if (this.f1520q.isFinishing()) {
            K3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void p() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void q() {
        if (this.f1520q.isFinishing()) {
            K3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void s() {
        if (this.f1520q.isFinishing()) {
            K3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void w() {
        this.f1523t = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void x() {
    }
}
