package D3;

import C0.C;
import C0.c0;
import C0.l0;
import C0.p0;
import C0.s0;
import C0.u0;
import C0.v0;
import C0.z0;
import D0.p;
import H.A;
import H.InterfaceC0035j;
import H.W;
import H.a0;
import I.q;
import O1.C0077n;
import W2.g;
import Z.f;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.provider.MediaStore;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallReceiver;
import b0.AbstractC0178L;
import b0.C0179M;
import b0.C0205r;
import b0.n0;
import c3.InterfaceFutureC0239a;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TutorialView2;
import com.google.android.gms.internal.ads.Cu;
import com.google.android.gms.internal.ads.InterfaceC0308Md;
import com.google.android.gms.internal.ads.InterfaceC0481ce;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g2.i;
import h1.AbstractC1698a;
import h2.m;
import j2.C1730a;
import j2.C1733d;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import m2.AbstractC1806a;
import n1.AbstractC1810c;
import n1.InterfaceC1811d;
import o1.InterfaceC1833I;
import o1.InterfaceC1854c;
import o1.InterfaceC1862g;
import r2.AbstractC1967a;
import t2.C1995b;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements androidx.activity.result.b, InterfaceC0035j, InterfaceC1854c, InterfaceC1811d, InterfaceC1862g, InterfaceC1833I, y1.b, E.b, q, InterfaceC0481ce, Cu, f, n0, I0.b, i {

    /* renamed from: q, reason: collision with root package name */
    public static volatile d f675q;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f676o;

    /* renamed from: p, reason: collision with root package name */
    public Object f677p;

    public d(int i4) {
        this.f676o = i4;
        switch (i4) {
            case 19:
                this.f677p = new ConcurrentHashMap();
                new AtomicInteger(0);
                return;
            case 26:
                this.f677p = new CopyOnWriteArraySet();
                return;
            default:
                this.f677p = new HashSet();
                return;
        }
    }

    public /* synthetic */ d(int i4, Object obj) {
        this.f676o = i4;
        this.f677p = obj;
    }

    public /* synthetic */ d(int i4, boolean z4) {
        this.f676o = i4;
    }

    public d(Context context, Uri uri) {
        this.f676o = 11;
        this.f677p = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public d(Context context, C0205r c0205r) {
        this.f676o = 13;
        this.f677p = new GestureDetector(context, c0205r, null);
    }

    public d(x0.f fVar, C2033d c2033d) {
        this.f676o = 18;
        this.f677p = fVar;
    }

    public static d u(boolean z4, int i4, int i5, int i6, int i7) {
        return new d(14, AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, false, z4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public void F(String str, int i4, String str2, boolean z4) {
        InterfaceC0308Md interfaceC0308Md = ((P1.a) this.f677p).f1494r;
        if (interfaceC0308Md != null) {
            interfaceC0308Md.S();
        }
    }

    @Override // E.b
    public Cursor a(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f677p;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e4) {
            Log.w("FontsProvider", "Unable to query the content provider", e4);
            return null;
        }
    }

    @Override // g2.i
    public void accept(Object obj, Object obj2) {
        A2.i iVar = (A2.i) obj2;
        C1730a c1730a = (C1730a) ((C1733d) obj).t();
        m mVar = (m) this.f677p;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c1730a.f10454q);
        int i4 = AbstractC1967a.f14753a;
        if (mVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            mVar.writeToParcel(obtain, 0);
        }
        try {
            c1730a.f10453p.transact(1, obtain, null, 1);
            obtain.recycle();
            iVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Cu
    /* renamed from: b */
    public InterfaceFutureC0239a mo0b() {
        W1.b bVar = (W1.b) this.f677p;
        return (InterfaceFutureC0239a) bVar.L3(bVar.f1973q, null, "BANNER", null, null).c.c();
    }

    @Override // o1.InterfaceC1862g
    public void c() {
        c0 c0Var = (c0) this.f677p;
        p pVar = (p) c0Var.f291h;
        if (pVar.h() == null) {
            return;
        }
        String name = c0Var.f287b.getName();
        SharedPreferences.Editor edit = pVar.h().getPreferences(0).edit();
        edit.putString("username", name);
        edit.apply();
        AbstractC1806a.f14015Y = name;
        if (c0Var.d != null) {
            AbstractC1806a.N(pVar.h(), c0Var.d);
        }
        c0.a(c0Var);
        C0077n.b(pVar.f623l0);
    }

    @Override // E.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f677p;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // o1.InterfaceC1854c
    public boolean d() {
        s0 s0Var = (s0) ((p0) this.f677p).f365s.f370f;
        if (s0Var.f388b) {
            return false;
        }
        return s0.b(s0Var);
    }

    @Override // o1.InterfaceC1862g
    public void e() {
        p pVar = (p) ((c0) this.f677p).f291h;
        try {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.addFlags(1);
            pVar.J(intent, 0);
        } catch (Throwable unused) {
            Context l4 = pVar.l();
            if (l4 == null) {
                return;
            }
            Toast.makeText(l4, R.string.no_application_for_this_action, 1).show();
        }
    }

    @Override // I.q
    public boolean f(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f677p;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = A.f779a;
        boolean z4 = view.getLayoutDirection() == 1;
        int i4 = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i4 == 0 && z4) && (i4 != 1 || z4)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        g gVar = swipeDismissBehavior.f12281b;
        if (gVar != null) {
            view.setVisibility(8);
            gVar.f2031a.a(0);
        }
        return true;
    }

    @Override // androidx.activity.result.b
    public void g(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f677p;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f2430p;
        int i4 = AbstractC1629o.b(intent, "ProxyBillingActivityV2").f72b;
        ResultReceiver resultReceiver = proxyBillingActivityV2.y;
        if (resultReceiver != null) {
            resultReceiver.send(i4, intent == null ? null : intent.getExtras());
        }
        int i5 = aVar.f2429o;
        if (i5 != -1 || i4 != 0) {
            AbstractC1629o.e("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i5 + " and billing's responseCode: " + i4);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // I3.a
    public Object get() {
        String packageName = ((Context) ((I3.a) this.f677p).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // I0.b
    public AbstractC1698a h(long j4) {
        throw new UnsupportedOperationException();
    }

    @Override // b0.n0
    public int i() {
        AbstractC0178L abstractC0178L = (AbstractC0178L) this.f677p;
        return abstractC0178L.f3196o - abstractC0178L.D();
    }

    @Override // b0.n0
    public int j(View view) {
        return AbstractC0178L.C(view) - ((ViewGroup.MarginLayoutParams) ((C0179M) view.getLayoutParams())).topMargin;
    }

    @Override // I0.b
    public C1995b k() {
        return (C1995b) this.f677p;
    }

    @Override // Z.f
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // H.InterfaceC0035j
    public a0 m(View view, a0 a0Var) {
        switch (this.f676o) {
            case 3:
                W w2 = a0Var.f811a;
                A.d f4 = w2.f(3);
                A.d f5 = w2.f(8);
                ((View) this.f677p).setPadding(f4.f1a, f4.f2b, f4.c, Math.max(f4.d, f5.d));
                return a0Var;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((x0.f) this.f677p).f15212p;
                bottomSheetBehavior.f12304i = a0Var.f811a.g().d;
                bottomSheetBehavior.H();
                return a0Var;
        }
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
        ((ProfileInstallReceiver) this.f677p).setResultCode(i4);
    }

    @Override // b0.n0
    public View o(int i4) {
        return ((AbstractC0178L) this.f677p).u(i4);
    }

    @Override // o1.InterfaceC1862g
    public void onCancel() {
        c0 c0Var = (c0) this.f677p;
        c0Var.c();
        c0.a(c0Var);
    }

    @Override // b0.n0
    public int p() {
        return ((AbstractC0178L) this.f677p).G();
    }

    @Override // b0.n0
    public int q(View view) {
        return AbstractC0178L.y(view) + ((ViewGroup.MarginLayoutParams) ((C0179M) view.getLayoutParams())).bottomMargin;
    }

    public Set r() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f677p)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) this.f677p);
        }
        return unmodifiableSet;
    }

    @Override // o1.InterfaceC1833I
    public void s(int i4) {
        switch (this.f676o) {
            case 8:
                ((l0) this.f677p).f340b.post(new A0.a(this, i4, 28));
                return;
            default:
                ((u0) this.f677p).f409b.post(new C(i4, 5, this));
                return;
        }
    }

    @Override // n1.InterfaceC1811d
    public void t(int i4) {
        switch (this.f676o) {
            case 5:
                u0 u0Var = (u0) this.f677p;
                ViewGroup viewGroup = u0Var.c;
                v0 v0Var = (v0) u0Var.f413h;
                if (!u0Var.f412g) {
                    v0.Q(v0Var, i4, true);
                    return;
                }
                viewGroup.removeAllViews();
                TutorialView2 tutorialView2 = (TutorialView2) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tutorial_view_layout2, viewGroup, false);
                tutorialView2.a(AbstractC1810c.a(i4), z0.Q(i4));
                viewGroup.addView(tutorialView2);
                return;
            default:
                ((z0) this.f677p).R(i4);
                return;
        }
    }
}
