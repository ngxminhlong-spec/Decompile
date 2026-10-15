package com.google.android.gms.internal.ads;

import O1.InterfaceC0078n0;
import O1.InterfaceC0084q0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Vk extends AbstractBinderC1149s4 implements InterfaceC0078n0 {

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f7275o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f7276p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f7277q;

    /* renamed from: r, reason: collision with root package name */
    public final Qk f7278r;

    /* renamed from: s, reason: collision with root package name */
    public final Su f7279s;

    /* renamed from: t, reason: collision with root package name */
    public Ok f7280t;

    public Vk(Context context, WeakReference weakReference, Qk qk, Su su) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f7275o = new HashMap();
        this.f7276p = context;
        this.f7277q = weakReference;
        this.f7278r = qk;
        this.f7279s = su;
    }

    public static H1.e N3() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        x0.f fVar = new x0.f(13);
        fVar.b(bundle);
        return new H1.e(fVar);
    }

    public static String O3(Object obj) {
        InterfaceC0084q0 interfaceC0084q0;
        H1.n nVar;
        InterfaceC0084q0 interfaceC0084q02;
        if (obj instanceof H1.j) {
            nVar = ((H1.j) obj).f875t;
        } else {
            InterfaceC0084q0 interfaceC0084q03 = null;
            if (obj instanceof P4) {
                try {
                    interfaceC0084q03 = ((P4) obj).f6565a.d();
                } catch (RemoteException e4) {
                    Y9.u("#007 Could not call remote method.", e4);
                }
                nVar = new H1.n(interfaceC0084q03);
            } else if (obj instanceof R1.a) {
                try {
                    O1.J j4 = ((H8) ((R1.a) obj)).c;
                    if (j4 != null) {
                        interfaceC0084q03 = j4.k();
                    }
                } catch (RemoteException e5) {
                    Y9.u("#007 Could not call remote method.", e5);
                }
                nVar = new H1.n(interfaceC0084q03);
            } else if (obj instanceof C0247Bb) {
                try {
                    InterfaceC1162sb interfaceC1162sb = ((C0247Bb) obj).f4082a;
                    if (interfaceC1162sb != null) {
                        interfaceC0084q03 = interfaceC1162sb.e();
                    }
                } catch (RemoteException e6) {
                    Y9.u("#007 Could not call remote method.", e6);
                }
                nVar = new H1.n(interfaceC0084q03);
            } else if (obj instanceof C0281Hb) {
                try {
                    InterfaceC1162sb interfaceC1162sb2 = ((C0281Hb) obj).f5428a;
                    if (interfaceC1162sb2 != null) {
                        interfaceC0084q03 = interfaceC1162sb2.e();
                    }
                } catch (RemoteException e7) {
                    Y9.u("#007 Could not call remote method.", e7);
                }
                nVar = new H1.n(interfaceC0084q03);
            } else {
                if (!(obj instanceof H1.g)) {
                    if (obj instanceof V1.c) {
                        try {
                            interfaceC0084q0 = ((C0818ka) ((V1.c) obj)).f9289a.h();
                        } catch (RemoteException e8) {
                            Y9.q("", e8);
                            interfaceC0084q0 = null;
                        }
                        nVar = interfaceC0084q0 != null ? new H1.n(interfaceC0084q0) : null;
                    }
                    return "";
                }
                nVar = ((H1.g) obj).getResponseInfo();
            }
        }
        if (nVar != null && (interfaceC0084q02 = nVar.f878a) != null) {
            try {
                return interfaceC0084q02.f();
            } catch (RemoteException unused) {
            }
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        String readString = parcel.readString();
        InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
        InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
        AbstractC1192t4.b(parcel);
        p2(readString, G12, G13);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void K3(Object obj, String str, String str2) {
        this.f7275o.put(str, obj);
        P3(O3(obj), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0049, TryCatch #2 {all -> 0x0049, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0010, B:14:0x001e, B:16:0x0026, B:18:0x0038, B:20:0x003c, B:22:0x0040, B:24:0x0044, B:27:0x0051, B:29:0x005c, B:31:0x005e, B:36:0x006c, B:37:0x0073, B:39:0x0077, B:42:0x007e, B:44:0x0082, B:49:0x008d, B:52:0x009a, B:53:0x00a1, B:55:0x00a5, B:60:0x00b0, B:63:0x00bd, B:64:0x00c4, B:66:0x00d2, B:68:0x00d6, B:70:0x00da, B:73:0x004c), top: B:2:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #2 {all -> 0x0049, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0010, B:14:0x001e, B:16:0x0026, B:18:0x0038, B:20:0x003c, B:22:0x0040, B:24:0x0044, B:27:0x0051, B:29:0x005c, B:31:0x005e, B:36:0x006c, B:37:0x0073, B:39:0x0077, B:42:0x007e, B:44:0x0082, B:49:0x008d, B:52:0x009a, B:53:0x00a1, B:55:0x00a5, B:60:0x00b0, B:63:0x00bd, B:64:0x00c4, B:66:0x00d2, B:68:0x00d6, B:70:0x00da, B:73:0x004c), top: B:2:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[Catch: all -> 0x0049, TRY_ENTER, TryCatch #2 {all -> 0x0049, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0010, B:14:0x001e, B:16:0x0026, B:18:0x0038, B:20:0x003c, B:22:0x0040, B:24:0x0044, B:27:0x0051, B:29:0x005c, B:31:0x005e, B:36:0x006c, B:37:0x0073, B:39:0x0077, B:42:0x007e, B:44:0x0082, B:49:0x008d, B:52:0x009a, B:53:0x00a1, B:55:0x00a5, B:60:0x00b0, B:63:0x00bd, B:64:0x00c4, B:66:0x00d2, B:68:0x00d6, B:70:0x00da, B:73:0x004c), top: B:2:0x0001, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void L3(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vk.L3(java.lang.String, java.lang.String):void");
    }

    public final Context M3() {
        Context context = (Context) this.f7277q.get();
        return context == null ? this.f7276p : context;
    }

    public final synchronized void P3(String str, String str2) {
        try {
            C0272Fc a4 = this.f7280t.a(str);
            C0258Da c0258Da = new C0258Da(this, str2, 23, false);
            a4.a(new Nu(0, a4, c0258Da), this.f7279s);
        } catch (NullPointerException e4) {
            N1.n.f1204A.f1209g.h("OutOfContextTester.setAdAsOutOfContext", e4);
            this.f7278r.b(str2);
        }
    }

    public final synchronized void Q3(String str, String str2) {
        try {
            C0272Fc a4 = this.f7280t.a(str);
            C0783ji c0783ji = new C0783ji(this, str2, 28, false);
            a4.a(new Nu(0, a4, c0783ji), this.f7279s);
        } catch (NullPointerException e4) {
            N1.n.f1204A.f1209g.h("OutOfContextTester.setAdAsShown", e4);
            this.f7278r.b(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9, types: [android.widget.FrameLayout, V1.b, android.view.View] */
    @Override // O1.InterfaceC0078n0
    public final void p2(String str, InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2) {
        String str2;
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        ViewGroup viewGroup = (ViewGroup) BinderC1813b.C2(interfaceC1812a2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap hashMap = this.f7275o;
        Object obj = hashMap.get(str);
        if (obj != null) {
            hashMap.remove(str);
        }
        if (obj instanceof H1.g) {
            H1.g gVar = (H1.g) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            Zf.W(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(gVar);
            gVar.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof V1.c) {
            V1.c cVar = (V1.c) obj;
            V1.e eVar = new V1.e(context);
            eVar.setTag("ad_view_tag");
            Zf.W(eVar, -1, -1);
            viewGroup.addView(eVar);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            Zf.W(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            eVar.addView(linearLayout2);
            Resources a4 = N1.n.f1204A.f1209g.a();
            linearLayout2.addView(Zf.R(context, a4 == null ? "Headline" : a4.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            T7 t7 = ((C0818ka) cVar).f9289a;
            String str3 = null;
            try {
                str2 = t7.p();
            } catch (RemoteException e4) {
                Y9.q("", e4);
                str2 = null;
            }
            TextView R4 = Zf.R(context, Bs.O(str2), android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            eVar.setHeadlineView(R4);
            linearLayout2.addView(R4);
            linearLayout2.addView(Zf.R(context, a4 == null ? "Body" : a4.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            try {
                str3 = t7.n();
            } catch (RemoteException e5) {
                Y9.q("", e5);
            }
            TextView R5 = Zf.R(context, Bs.O(str3), android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            eVar.setBodyView(R5);
            linearLayout2.addView(R5);
            linearLayout2.addView(Zf.R(context, a4 == null ? "Media View" : a4.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            ?? frameLayout = new FrameLayout(context);
            frameLayout.setTag("media_view_tag");
            eVar.setMediaView(frameLayout);
            linearLayout2.addView(frameLayout);
            eVar.setNativeAd(cVar);
        }
    }
}
