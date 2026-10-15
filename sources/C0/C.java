package C0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import b0.AbstractC0178L;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.GoPremiumLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.google.android.gms.internal.ads.C0337Sc;
import com.google.android.gms.internal.ads.C0857lC;
import com.google.android.gms.internal.ads.C0977o3;
import com.google.android.gms.internal.ads.SurfaceHolderCallbackC0730iC;
import com.google.android.gms.internal.ads.TB;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC0312Nc;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC0651gd;
import com.google.android.gms.internal.ads.U3;
import com.google.android.gms.internal.ads.UB;
import com.google.android.gms.internal.ads.Zf;
import f.AbstractActivityC1671f;
import java.util.concurrent.Future;
import m2.AbstractC1806a;
import o2.AbstractC1895f;
import q1.AbstractC1959n;
import z.AbstractC2123b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f165o;

    /* renamed from: p, reason: collision with root package name */
    public int f166p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f167q;

    public /* synthetic */ C(int i4, int i5, Object obj) {
        this.f165o = i5;
        this.f167q = obj;
        this.f166p = i4;
    }

    public /* synthetic */ C(H h4, int i4) {
        this.f165o = i4;
        this.f167q = h4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0977o3 c0977o3;
        switch (this.f165o) {
            case 0:
                AbstractActivityC1671f h4 = ((D) this.f167q).h();
                if (h4 == null) {
                    return;
                }
                AbstractC1895f.y(h4, this.f166p, null);
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) this.f167q;
                GoPremiumLayout goPremiumLayout = mainActivity.f3571H;
                goPremiumLayout.f3612p.setVisibility(0);
                q0 q0Var = goPremiumLayout.f3611o;
                q0Var.d = 0;
                q0Var.d();
                goPremiumLayout.findViewById(R.id.pricing_success).setVisibility(8);
                goPremiumLayout.findViewById(R.id.all_container).setVisibility(0);
                goPremiumLayout.findViewById(R.id.prices_error).setVisibility(8);
                goPremiumLayout.f3615s.setVisibility(0);
                goPremiumLayout.findViewById(R.id.why_buy_message_container).setVisibility(8);
                goPremiumLayout.findViewById(R.id.billing_error_container).setVisibility(8);
                goPremiumLayout.findViewById(R.id.pending_error_container).setVisibility(8);
                if (AbstractC1806a.f14028g0 == null) {
                    AbstractC1806a.f14028g0 = Long.valueOf(mainActivity.getPreferences(0).getLong("go_premium_closed_times", 0L));
                }
                if (AbstractC1959n.c(mainActivity)) {
                    mainActivity.f3571H.getClass();
                }
                if (AbstractC1806a.f14006P || !AbstractC1806a.f14008R || !AbstractC1806a.f14009S || !AbstractC1806a.f14010T || !AbstractC1806a.f14011U) {
                    GoPremiumLayout goPremiumLayout2 = mainActivity.f3571H;
                    goPremiumLayout2.f3614r.setVisibility(0);
                    goPremiumLayout2.f3612p.setVisibility(8);
                    goPremiumLayout2.f3615s.setVisibility(8);
                }
                int i4 = this.f166p;
                if (i4 != 0) {
                    mainActivity.f3571H.setMessage(i4);
                }
                if (AbstractC1806a.O(mainActivity)) {
                    mainActivity.f3571H.findViewById(R.id.billing_error_container).setVisibility(0);
                }
                if (AbstractC1806a.f14007Q) {
                    GoPremiumLayout goPremiumLayout3 = mainActivity.f3571H;
                    goPremiumLayout3.findViewById(R.id.billing_error_container).setVisibility(8);
                    goPremiumLayout3.findViewById(R.id.pending_error_container).setVisibility(0);
                }
                mainActivity.f3572I.setVisibility(0);
                return;
            case 2:
                int i5 = this.f166p / ((u0) ((x0.f) this.f167q).f15212p).f408a;
                return;
            case 3:
                int i6 = this.f166p;
                x0 x0Var = (x0) this.f167q;
                int i7 = i6 / x0Var.f450o;
                if (i7 == 0 || ((z0) x0Var.f454s).f466j0) {
                    i7 = 1;
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) x0Var.f452q;
                if (gridLayoutManager.f3002F != i7) {
                    gridLayoutManager.l1(i7);
                    ((q0) x0Var.f453r).d();
                    return;
                }
                return;
            case 4:
                AbstractActivityC1671f h5 = ((D0.g) this.f167q).h();
                if (h5 == null) {
                    return;
                }
                AbstractC1895f.y(h5, this.f166p, null);
                return;
            case 5:
                int i8 = this.f166p / ((u0) ((D3.d) this.f167q).f677p).f408a;
                return;
            case 6:
                D3.d dVar = (D3.d) this.f167q;
                int i9 = this.f166p;
                AbstractC2123b abstractC2123b = (AbstractC2123b) dVar.f677p;
                if (abstractC2123b != null) {
                    abstractC2123b.h(i9);
                    return;
                }
                return;
            case 7:
                int i10 = this.f166p;
                U3 u32 = (U3) this.f167q;
                if (i10 > 0) {
                    try {
                        Thread.sleep(i10 * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    PackageInfo packageInfo = u32.f7127a.getPackageManager().getPackageInfo(u32.f7127a.getPackageName(), 0);
                    Context context = u32.f7127a;
                    c0977o3 = Zf.e(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
                } catch (Throwable unused2) {
                    c0977o3 = null;
                }
                ((U3) this.f167q).f7134j = c0977o3;
                if (this.f166p < 4) {
                    if (c0977o3 != null && c0977o3.f0() && !c0977o3.t0().equals("0000000000000000000000000000000000000000000000000000000000000000") && c0977o3.g0() && c0977o3.r0().x() && c0977o3.r0().v() != -2) {
                        return;
                    }
                    U3 u33 = (U3) this.f167q;
                    int i11 = this.f166p + 1;
                    if (u33.f7138n) {
                        Future<?> submit = u33.f7128b.submit(new C(i11, 7, u33));
                        if (i11 == 0) {
                            u33.f7135k = submit;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                TextureViewSurfaceTextureListenerC0312Nc textureViewSurfaceTextureListenerC0312Nc = (TextureViewSurfaceTextureListenerC0312Nc) this.f167q;
                int i12 = this.f166p;
                C0337Sc c0337Sc = textureViewSurfaceTextureListenerC0312Nc.f6324D;
                if (c0337Sc != null) {
                    c0337Sc.onWindowVisibilityChanged(i12);
                    return;
                }
                return;
            case 9:
                TextureViewSurfaceTextureListenerC0651gd textureViewSurfaceTextureListenerC0651gd = (TextureViewSurfaceTextureListenerC0651gd) this.f167q;
                int i13 = this.f166p;
                C0337Sc c0337Sc2 = textureViewSurfaceTextureListenerC0651gd.f8831t;
                if (c0337Sc2 != null) {
                    c0337Sc2.onWindowVisibilityChanged(i13);
                    return;
                }
                return;
            case 10:
                UB ub = ((TB) this.f167q).f7052b;
                int i14 = this.f166p;
                if (i14 == -3 || i14 == -2) {
                    if (i14 != -2) {
                        ub.b(3);
                        return;
                    }
                    SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC = ub.c;
                    if (surfaceHolderCallbackC0730iC != null) {
                        C0857lC c0857lC = surfaceHolderCallbackC0730iC.f9035o;
                        boolean o12 = c0857lC.o1();
                        c0857lC.C1(0, o12 ? 2 : 1, o12);
                    }
                    ub.b(2);
                    return;
                }
                if (i14 == -1) {
                    SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC2 = ub.c;
                    if (surfaceHolderCallbackC0730iC2 != null) {
                        C0857lC c0857lC2 = surfaceHolderCallbackC0730iC2.f9035o;
                        boolean o13 = c0857lC2.o1();
                        c0857lC2.C1(-1, o13 ? 2 : 1, o13);
                    }
                    ub.a();
                    return;
                }
                if (i14 != 1) {
                    U.a.p(i14, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                }
                ub.b(1);
                SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC3 = ub.c;
                if (surfaceHolderCallbackC0730iC3 != null) {
                    C0857lC c0857lC3 = surfaceHolderCallbackC0730iC3.f9035o;
                    c0857lC3.C1(1, 1, c0857lC3.o1());
                    return;
                }
                return;
            case 11:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.i) this.f167q).f12384n0;
                int i15 = this.f166p;
                if (recyclerView.f3043J) {
                    return;
                }
                AbstractC0178L abstractC0178L = recyclerView.f3025A;
                if (abstractC0178L == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return;
                } else {
                    abstractC0178L.w0(recyclerView, i15);
                    return;
                }
            case 12:
                ((g2.m) this.f167q).f(this.f166p);
                return;
            case 13:
                int i16 = this.f166p;
                H1.a aVar = (H1.a) this.f167q;
                int i17 = i16 / aVar.f855p;
                if (i17 == 0) {
                    i17 = 1;
                }
                GridLayoutManager gridLayoutManager2 = (GridLayoutManager) aVar.f857r;
                if (gridLayoutManager2.f3002F != i17) {
                    gridLayoutManager2.l1(i17);
                    ((TimeDiagramLayout) aVar.f858s).f3727q.d();
                    return;
                }
                return;
            default:
                ((SystemForegroundService) this.f167q).f3158s.cancel(this.f166p);
                return;
        }
    }
}
