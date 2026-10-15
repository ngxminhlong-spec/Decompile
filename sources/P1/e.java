package P1;

import B0.v;
import N1.n;
import O1.r;
import Q1.AbstractC0115n;
import Q1.N;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0478cb;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1016p;
import com.google.android.gms.internal.ads.C1035pc;
import com.google.android.gms.internal.ads.C1421yc;
import com.google.android.gms.internal.ads.Ds;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.M3;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1023p6;
import com.google.android.gms.internal.ads.Y9;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends AbstractC0115n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1514b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, Object obj) {
        super(0);
        this.f1514b = i4;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(0);
        this.f1514b = 1;
        this.c = context;
    }

    private final void h() {
        boolean z4;
        try {
            z4 = L1.b.b((Context) this.c);
        } catch (e2.g | IOException | IllegalStateException e4) {
            Y9.q("Fail to get isAdIdFakeForDebugLogging", e4);
            z4 = false;
        }
        synchronized (C1421yc.f11357b) {
            C1421yc.c = true;
            C1421yc.d = z4;
        }
        Y9.s("Update ad debug logging enablement as " + z4);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.Qb, java.lang.Object] */
    @Override // Q1.AbstractC0115n
    public final void e() {
        BitmapDrawable bitmapDrawable;
        switch (this.f1514b) {
            case 0:
                a aVar = (a) this.c;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) n.f1204A.f1223u.f677p).get(Integer.valueOf(aVar.f1493q.f3857C.f1181t));
                if (bitmap != null) {
                    N1.h hVar = aVar.f1493q.f3857C;
                    boolean z4 = hVar.f1179r;
                    float f4 = hVar.f1180s;
                    Activity activity = aVar.f1492p;
                    if (!z4 || f4 <= 0.0f || f4 > 25.0f) {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    } else {
                        try {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                            RenderScript create = RenderScript.create(activity);
                            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                            create2.setRadius(f4);
                            create2.setInput(createFromBitmap);
                            create2.forEach(createFromBitmap2);
                            createFromBitmap2.copyTo(createBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                    }
                    N.f1668k.post(new Nu(24, this, bitmapDrawable));
                    return;
                }
                return;
            case 1:
                h();
                return;
            default:
                C1035pc c1035pc = (C1035pc) this.c;
                Context context = c1035pc.f9970e;
                String str = c1035pc.f9971f.f4084o;
                ?? obj = new Object();
                obj.f6661q = context;
                obj.f6662r = str;
                obj.f6659o = (String) H6.f5411a.r();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                obj.f6660p = linkedHashMap;
                linkedHashMap.put("s", "gmob_sdk");
                linkedHashMap.put("v", "3");
                linkedHashMap.put("os", Build.VERSION.RELEASE);
                linkedHashMap.put("api_v", Build.VERSION.SDK);
                n nVar = n.f1204A;
                N n4 = nVar.c;
                linkedHashMap.put("device", N.E());
                linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
                linkedHashMap.put("is_lite_sdk", true != N.c(context) ? "0" : "1");
                M3 m32 = nVar.f1216n;
                m32.getClass();
                InterfaceFutureC0239a b4 = AbstractC0266Ec.f4897a.b(new v(m32, context, 6, false));
                try {
                    linkedHashMap.put("network_coarse", Integer.toString(((C0478cb) b4.get()).f8362j));
                    linkedHashMap.put("network_fine", Integer.toString(((C0478cb) b4.get()).f8363k));
                } catch (Exception e4) {
                    n.f1204A.f1209g.h("CsiConfiguration.CsiConfiguration", e4);
                }
                C0937n6 c0937n6 = AbstractC1066q6.B9;
                r rVar = r.d;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj.f6660p;
                    N n5 = n.f1204A.c;
                    linkedHashMap2.put("is_bstar", true != N.a(context) ? "0" : "1");
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.p8)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10147P1)).booleanValue()) {
                    n nVar2 = n.f1204A;
                    if (!Ds.a(nVar2.f1209g.f9972g)) {
                        ((LinkedHashMap) obj.f6660p).put("plugin", nVar2.f1209g.f9972g);
                    }
                }
                synchronized (((C1035pc) this.c).f9968a) {
                    try {
                        C1016p c1016p = n.f1204A.f1214l;
                        C1016p.m(((C1035pc) this.c).f9973h, obj);
                    } catch (IllegalArgumentException e5) {
                        Y9.t("Cannot config CSI reporter.", e5);
                    }
                }
                return;
        }
    }
}
