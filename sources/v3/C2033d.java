package v3;

import A2.q;
import C0.C0003c;
import N1.n;
import O1.InterfaceC0051a;
import Q1.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import c0.BinderC0225f;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.C0887m;
import com.google.android.gms.internal.ads.Sh;
import com.google.firebase.components.ComponentRegistrar;
import d3.AbstractC1654b;
import g2.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import k.m;
import k.y;
import n3.C1814a;
import o1.InterfaceC1866i;
import o2.C1893d;
import o2.InterfaceC1891b;
import o2.InterfaceC1892c;
import q.C1944a;
import q2.AbstractC1960a;
import q2.C1961b;
import q2.C1962c;
import t1.EnumC1992c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: v3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2033d implements y1.b, InterfaceC1866i, F1.a, t, T1.b, T1.d, Z.f, y, InterfaceC1891b, InterfaceC1892c, i {

    /* renamed from: p, reason: collision with root package name */
    public static C2033d f15098p;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15099o;

    public /* synthetic */ C2033d(int i4) {
        this.f15099o = i4;
    }

    public static Path i(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(f4, f5);
        path.lineTo(f6, f7);
        return path;
    }

    public static final void m(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z4) {
        if (adOverlayInfoParcel.y != 4 || adOverlayInfoParcel.f3868q != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f3855A.f4087r);
            intent.putExtra("shouldCallOnOverlayOpened", z4);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            N n4 = n.f1204A.c;
            N.o(context, intent);
            return;
        }
        InterfaceC0051a interfaceC0051a = adOverlayInfoParcel.f3867p;
        if (interfaceC0051a != null) {
            interfaceC0051a.D();
        }
        Sh sh = adOverlayInfoParcel.f3863I;
        if (sh != null) {
            sh.G0();
        }
        Activity g4 = adOverlayInfoParcel.f3869r.g();
        P1.b bVar = adOverlayInfoParcel.f3866o;
        if (bVar != null && bVar.f1511x && g4 != null) {
            context = g4;
        }
        V2.e eVar = n.f1204A.f1205a;
        V2.e.j(context, bVar, adOverlayInfoParcel.f3874w, bVar != null ? bVar.f1510w : null);
    }

    @Override // k.y
    public void a(m mVar, boolean z4) {
    }

    @Override // g2.i
    public void accept(Object obj, Object obj2) {
        C1962c c1962c = (C1962c) ((C1961b) obj).t();
        BinderC0225f binderC0225f = new BinderC0225f((A2.i) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i4 = AbstractC1960a.f14704a;
        obtain.writeInt(1);
        AbstractC1654b.e0(obtain, AbstractC1654b.a0(obtain, 20293));
        obtain.writeStrongBinder(binderC0225f);
        Parcel obtain2 = Parcel.obtain();
        try {
            c1962c.f14705o.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // androidx.lifecycle.t
    public s b() {
        return new S.a();
    }

    @Override // F1.a
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // k.y
    public boolean d(m mVar) {
        return false;
    }

    @Override // androidx.lifecycle.t
    public s e(Class cls, R.b bVar) {
        return b();
    }

    @Override // o2.InterfaceC1891b
    public int f(Context context, String str) {
        return C1893d.a(context, str);
    }

    @Override // o2.InterfaceC1891b
    public int g(Context context, String str, boolean z4) {
        return C1893d.d(context, str, z4);
    }

    @Override // I3.a
    public Object get() {
        switch (this.f15099o) {
            case 3:
                V2.e eVar = new V2.e(6);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(EnumC1992c.f14844o, new C1.c(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(EnumC1992c.f14846q, new C1.c(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(C1.e.f476p)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(EnumC1992c.f14845p, new C1.c(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < EnumC1992c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C1.b(eVar, hashMap);
            default:
                return new q(1, Executors.newSingleThreadExecutor());
        }
    }

    @Override // o2.InterfaceC1892c
    public C0887m h(Context context, String str, InterfaceC1891b interfaceC1891b) {
        C0887m c0887m = new C0887m();
        c0887m.f9512a = interfaceC1891b.f(context, str);
        int i4 = 1;
        int g4 = interfaceC1891b.g(context, str, true);
        c0887m.f9513b = g4;
        int i5 = c0887m.f9512a;
        if (i5 == 0) {
            i5 = 0;
            if (g4 == 0) {
                i4 = 0;
                c0887m.c = i4;
                return c0887m;
            }
        }
        if (i5 >= g4) {
            i4 = -1;
        }
        c0887m.c = i4;
        return c0887m;
    }

    public List j(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C1814a c1814a : componentRegistrar.getComponents()) {
            String str = c1814a.f14112a;
            if (str != null) {
                c1814a = new C1814a(str, c1814a.f14113b, c1814a.c, c1814a.d, c1814a.f14114e, new C0003c(5, str, c1814a), c1814a.f14116g);
            }
            arrayList.add(c1814a);
        }
        return arrayList;
    }

    public void k(C0831kn c0831kn, float f4) {
        C1944a c1944a = (C1944a) ((Drawable) c0831kn.f9319p);
        CardView cardView = (CardView) c0831kn.f9320q;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f4 != c1944a.f14609e || c1944a.f14610f != useCompatPadding || c1944a.f14611g != preventCornerOverlap) {
            c1944a.f14609e = f4;
            c1944a.f14610f = useCompatPadding;
            c1944a.f14611g = preventCornerOverlap;
            c1944a.b(null);
            c1944a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c0831kn.w(0, 0, 0, 0);
            return;
        }
        C1944a c1944a2 = (C1944a) ((Drawable) c0831kn.f9319p);
        float f5 = c1944a2.f14609e;
        float f6 = c1944a2.f14607a;
        int ceil = (int) Math.ceil(q.b.a(f5, f6, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(q.b.b(f5, f6, cardView.getPreventCornerOverlap()));
        c0831kn.w(ceil, ceil2, ceil, ceil2);
    }

    @Override // Z.f
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // Z.f
    public void n(int i4, Object obj) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // o1.InterfaceC1866i
    public void r() {
    }
}
