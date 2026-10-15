package A0;

import A2.c;
import A2.l;
import B0.d;
import B0.m;
import B0.p;
import C0.A0;
import C0.C0001a0;
import C0.C0008h;
import C0.D;
import C0.DialogInterfaceOnDismissListenerC0015o;
import C0.N;
import C0.O;
import C0.RunnableC0016p;
import C0.ViewOnClickListenerC0014n;
import C0.ViewOnClickListenerC0019t;
import C0.X;
import C0.Y;
import C0.l0;
import C0.s0;
import C0.t0;
import C0.u0;
import C0.v0;
import D0.k;
import O1.C0077n;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c3.InterfaceFutureC0239a;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.Nu;
import java.util.Collections;
import n0.j;
import n0.n;
import o1.InterfaceC1833I;
import w0.i;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f23o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f24p;

    public /* synthetic */ a(int i4, Object obj) {
        this.f23o = i4;
        this.f24p = obj;
    }

    public /* synthetic */ a(InterfaceC1833I interfaceC1833I, int i4, int i5) {
        this.f23o = i5;
        this.f24p = interfaceC1833I;
    }

    private final void a() {
        synchronized (((l) this.f24p).c) {
            ((c) ((l) this.f24p).d).a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = 1;
        boolean z4 = false;
        switch (this.f23o) {
            case 0:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f24p;
                Object obj = constraintTrackingWorker.getInputData().f14090a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj instanceof String ? (String) obj : null;
                if (TextUtils.isEmpty(str)) {
                    n.d().c(ConstraintTrackingWorker.y, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f3163w.i(new j());
                    return;
                }
                ListenableWorker a4 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.f3160t);
                constraintTrackingWorker.f3164x = a4;
                if (a4 == null) {
                    n.d().a(ConstraintTrackingWorker.y, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f3163w.i(new j());
                    return;
                }
                i h4 = o0.l.N(constraintTrackingWorker.getApplicationContext()).f14175n.n().h(constraintTrackingWorker.getId().toString());
                if (h4 == null) {
                    constraintTrackingWorker.f3163w.i(new j());
                    return;
                }
                s0.c cVar = new s0.c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                cVar.c(Collections.singletonList(h4));
                if (!cVar.a(constraintTrackingWorker.getId().toString())) {
                    n.d().a(ConstraintTrackingWorker.y, U.a.k("Constraints not met for delegate ", str, ". Requesting retry."), new Throwable[0]);
                    constraintTrackingWorker.f3163w.i(new Object());
                    return;
                }
                n.d().a(ConstraintTrackingWorker.y, n0.a.k("Constraints met for delegate ", str), new Throwable[0]);
                try {
                    InterfaceFutureC0239a startWork = constraintTrackingWorker.f3164x.startWork();
                    startWork.a(new Nu(constraintTrackingWorker, startWork, i4, z4), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    n d = n.d();
                    String str2 = ConstraintTrackingWorker.y;
                    d.a(str2, U.a.k("Delegated worker ", str, " threw exception in startWork."), th);
                    synchronized (constraintTrackingWorker.f3161u) {
                        try {
                            if (constraintTrackingWorker.f3162v) {
                                n.d().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.f3163w.i(new Object());
                            } else {
                                constraintTrackingWorker.f3163w.i(new j());
                            }
                            return;
                        } finally {
                        }
                    }
                }
            case 1:
                a();
                return;
            case 2:
                m mVar = (m) this.f24p;
                mVar.f91r.f46a = 0;
                mVar.f91r.f50g = null;
                d dVar = p.f103l;
                mVar.f91r.h(B0.n.a(24, 6, dVar));
                mVar.a(dVar);
                return;
            case 3:
                A0 a02 = ((C0008h) this.f24p).f323p.f220s0;
                if (a02 != null) {
                    ((MainActivity) a02).E(0);
                    return;
                }
                return;
            case 4:
                RunnableC0016p runnableC0016p = ((DialogInterfaceOnDismissListenerC0015o) this.f24p).f353o;
                D.Q(runnableC0016p.f360q, runnableC0016p.f359p);
                return;
            case 5:
                ViewOnClickListenerC0014n viewOnClickListenerC0014n = (ViewOnClickListenerC0014n) this.f24p;
                D.Q((D) viewOnClickListenerC0014n.f349p, (View) viewOnClickListenerC0014n.f350q);
                return;
            case 6:
                ((D) ((C0077n) this.f24p).f1372s).N0.setVisibility(8);
                return;
            case 7:
                MainActivity mainActivity = (MainActivity) this.f24p;
                int i5 = MainActivity.f3569O;
                mainActivity.A();
                return;
            case 8:
                ((View) this.f24p).setVisibility(8);
                return;
            case 9:
                Toast.makeText((MainActivity) ((f) this.f24p).f15212p, R.string.error_purchasing, 1).show();
                return;
            case 10:
                ((View) ((N) this.f24p).f240q).setVisibility(8);
                return;
            case 11:
                ((View) ((O) this.f24p).f243p).setVisibility(8);
                return;
            case 12:
                A0 a03 = ((X) this.f24p).f260o.f432n0;
                if (a03 != null) {
                    ((MainActivity) a03).E(0);
                    return;
                }
                return;
            case 13:
                ((v0) this.f24p).f429k0.setVisibility(0);
                return;
            case 14:
                C0001a0 c0001a0 = (C0001a0) this.f24p;
                ((ViewGroup) c0001a0.f277s).setVisibility(8);
                c0001a0.f273o = false;
                return;
            case 15:
                ((ScrollView) ((C0001a0) ((Y) ((ViewOnClickListenerC0019t) this.f24p).f398s).f263g).f275q).smoothScrollTo(0, 0);
                return;
            case 16:
                ((N) this.f24p).f239p = false;
                return;
            case 17:
                f fVar = (f) this.f24p;
                ((l0) fVar.f15212p).getClass();
                ((l0) fVar.f15212p).f341e.setTranslationY(-r0.f340b.computeVerticalScrollOffset());
                return;
            case 18:
                l0 l0Var = (l0) this.f24p;
                l0Var.d.setVisibility(8);
                l0Var.c = false;
                return;
            case 19:
                s0 s0Var = (s0) this.f24p;
                ((ViewGroup) s0Var.f389e).setVisibility(8);
                s0.b(s0Var);
                if (s0Var.f388b) {
                    s0.c(s0Var);
                }
                s0Var.f387a = false;
                return;
            case 20:
                ((t0) this.f24p).f401q = false;
                return;
            case 21:
                u0 u0Var = (u0) this.f24p;
                u0Var.d.setVisibility(8);
                u0Var.f411f = false;
                return;
            case 22:
                A0 a04 = ((D0.d) this.f24p).f536p.f574p0;
                if (a04 != null) {
                    ((MainActivity) a04).E(0);
                    return;
                }
                return;
            case 23:
                A0 a05 = ((k) this.f24p).f589o.f624m0;
                if (a05 != null) {
                    ((MainActivity) a05).E(0);
                    return;
                }
                return;
            case 24:
                ((D0.p) this.f24p).f621j0.setVisibility(0);
                return;
            case 25:
                C0001a0 c0001a02 = (C0001a0) this.f24p;
                ((ViewGroup) c0001a02.f277s).setVisibility(8);
                c0001a02.f273o = false;
                return;
            case 26:
                ((ScrollView) ((C0001a0) ((Y) ((ViewOnClickListenerC0019t) this.f24p).f398s).f263g).f275q).smoothScrollTo(0, 0);
                return;
            case 27:
                ((N) this.f24p).f239p = false;
                return;
            case 28:
                D3.d dVar2 = (D3.d) this.f24p;
                ((l0) dVar2.f677p).getClass();
                ((l0) dVar2.f677p).f341e.setTranslationY(-r0.f340b.computeVerticalScrollOffset());
                return;
            default:
                l0 l0Var2 = (l0) this.f24p;
                l0Var2.d.setVisibility(8);
                l0Var2.c = false;
                return;
        }
    }
}
