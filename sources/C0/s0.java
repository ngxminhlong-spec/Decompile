package C0;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import com.google.android.gms.internal.ads.C0835kr;
import com.google.android.gms.internal.ads.C1135rr;
import com.google.android.gms.internal.ads.C1475zn;
import com.google.android.gms.internal.ads.Ho;
import com.google.android.gms.internal.ads.InterfaceC1132ro;
import com.google.android.gms.internal.ads.InterfaceC1390xo;
import com.google.android.gms.internal.ads.RunnableC1004oo;
import com.google.android.gms.internal.ads.Zf;
import com.google.android.gms.internal.measurement.C1510e1;
import f.AbstractActivityC1671f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f387a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f388b;
    public final Object c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f389e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f390f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f391g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f392h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f393i;

    public s0(v0 v0Var, ViewGroup viewGroup) {
        int i4;
        this.f393i = v0Var;
        AbstractActivityC1671f h4 = v0Var.h();
        if (h4 == null) {
            return;
        }
        this.f389e = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.shared_recycler);
        this.f391g = viewGroup.findViewById(R.id.shared_fab_container);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.shared_explore);
        this.c = viewGroup2;
        this.d = (ViewGroup) viewGroup.findViewById(R.id.explore_on_phone_container);
        boolean H3 = AbstractC1806a.H(viewGroup.getContext());
        this.f388b = H3;
        this.f390f = viewGroup.findViewById(R.id.empty_search_results_text);
        if (H3) {
            viewGroup2.setVisibility(4);
        }
        q0 q0Var = new q0(this);
        this.f392h = q0Var;
        recyclerView.setAdapter(q0Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        View findViewById = viewGroup.findViewById(R.id.shared_search_progress);
        View findViewById2 = viewGroup.findViewById(R.id.share_fab);
        if (H3) {
            v.e eVar = (v.e) findViewById2.getLayoutParams();
            eVar.setMarginEnd(v0Var.l().getResources().getDimensionPixelSize(R.dimen.fab_margin) * 2);
            findViewById2.setLayoutParams(eVar);
        }
        findViewById2.setOnClickListener(new ViewOnClickListenerC0022w(2, this));
        Integer num = l1.f.f13954h;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = h4.getPreferences(0).getInt("show_shared_msg", 0);
            l1.f.f13954h = Integer.valueOf(i4);
        }
        if (i4 < 3) {
            View findViewById3 = viewGroup.findViewById(R.id.shared_message_container);
            findViewById3.setVisibility(0);
            findViewById3.findViewById(R.id.shared_close_message).setOnClickListener(new ViewOnClickListenerC0014n(findViewById3, h4));
        }
        C1510e1 c1510e1 = new C1510e1(4, this, findViewById);
        l1.f fVar = l1.f.f13951e;
        fVar.getClass();
        l1.e eVar2 = new l1.e(fVar, (String) null, c1510e1);
        if (fVar.d != null) {
            fVar.c = eVar2;
        } else {
            fVar.d = eVar2;
            eVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
        EditText editText = (EditText) viewGroup.findViewById(R.id.search_edit);
        editText.addTextChangedListener(new n0(findViewById, c1510e1));
        viewGroup.findViewById(R.id.shared_search_container).setOnClickListener(new ViewOnClickListenerC0022w(this, editText));
    }

    public s0(Looper looper, C1475zn c1475zn, InterfaceC1390xo interfaceC1390xo) {
        this(new CopyOnWriteArraySet(), looper, c1475zn, interfaceC1390xo, true);
    }

    public s0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C1475zn c1475zn, InterfaceC1390xo interfaceC1390xo, boolean z4) {
        this.c = c1475zn;
        this.f390f = copyOnWriteArraySet;
        this.f389e = interfaceC1390xo;
        this.f393i = new Object();
        this.f391g = new ArrayDeque();
        this.f392h = new ArrayDeque();
        this.d = c1475zn.d(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.lo
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C0.s0 s0Var = C0.s0.this;
                Iterator it = ((CopyOnWriteArraySet) s0Var.f390f).iterator();
                while (it.hasNext()) {
                    Ho ho = (Ho) it.next();
                    InterfaceC1390xo interfaceC1390xo2 = (InterfaceC1390xo) s0Var.f389e;
                    if (!ho.d && ho.c) {
                        Q0 g4 = ho.f5510b.g();
                        ho.f5510b = new B0.q();
                        ho.c = false;
                        interfaceC1390xo2.d(ho.f5509a, g4);
                    }
                    if (((C1135rr) s0Var.d).f10539a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f388b = z4;
    }

    public static void a(s0 s0Var, boolean z4) {
        v0 v0Var = (v0) s0Var.f393i;
        ViewGroup viewGroup = (ViewGroup) s0Var.f389e;
        int visibility = viewGroup.getVisibility();
        int i4 = z4 ? 0 : 8;
        if (visibility == i4) {
            if (visibility != 0 || s0Var.f387a) {
                return;
            }
            v0.R(v0Var, R.id.shared_tab);
            return;
        }
        if (i4 != 0) {
            s0Var.f387a = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100L);
            viewGroup.startAnimation(alphaAnimation);
            viewGroup.postDelayed(new A0.a(19, s0Var), 100L);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(100L);
        viewGroup.setVisibility(0);
        viewGroup.startAnimation(alphaAnimation2);
        v0.S(v0Var, v0Var.f428j0);
        v0.R(v0Var, R.id.shared_tab);
    }

    public static boolean b(s0 s0Var) {
        ViewGroup viewGroup = (ViewGroup) s0Var.d;
        if (viewGroup.getVisibility() != 0) {
            return false;
        }
        if (viewGroup.getChildCount() > 0) {
            ((CircuitExploreDialog) viewGroup.getChildAt(0)).d();
        }
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
        return true;
    }

    public static void c(s0 s0Var) {
        ViewGroup viewGroup = (ViewGroup) s0Var.c;
        if (viewGroup.getVisibility() == 0) {
            if (viewGroup.getChildCount() > 0) {
                ((CircuitExploreDialog) viewGroup.getChildAt(0)).d();
            }
            viewGroup.removeAllViews();
            viewGroup.setVisibility(4);
            q0 q0Var = (q0) s0Var.f392h;
            int i4 = q0Var.d;
            q0Var.d = -1;
            if (i4 >= 0) {
                q0Var.e(i4);
            }
        }
    }

    public void d(Object obj) {
        synchronized (this.f393i) {
            try {
                if (this.f387a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f390f).add(new Ho(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        C1135rr c1135rr = (C1135rr) this.d;
        ArrayDeque arrayDeque = (ArrayDeque) this.f391g;
        h();
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f392h;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (!c1135rr.f10539a.hasMessages(0)) {
            Handler handler = c1135rr.f10539a;
            C0835kr d = C1135rr.d();
            Message obtainMessage = handler.obtainMessage(0);
            d.f9326a = obtainMessage;
            Handler handler2 = c1135rr.f10539a;
            obtainMessage.getClass();
            handler2.sendMessageAtFrontOfQueue(obtainMessage);
            d.b();
        }
        boolean isEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (isEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public void f(int i4, InterfaceC1132ro interfaceC1132ro) {
        h();
        ((ArrayDeque) this.f392h).add(new RunnableC1004oo(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f390f), i4, interfaceC1132ro));
    }

    public void g() {
        h();
        synchronized (this.f393i) {
            this.f387a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f390f).iterator();
        while (it.hasNext()) {
            Ho ho = (Ho) it.next();
            InterfaceC1390xo interfaceC1390xo = (InterfaceC1390xo) this.f389e;
            ho.d = true;
            if (ho.c) {
                ho.c = false;
                interfaceC1390xo.d(ho.f5509a, ho.f5510b.g());
            }
        }
        ((CopyOnWriteArraySet) this.f390f).clear();
    }

    public void h() {
        if (this.f388b) {
            Zf.X(Thread.currentThread() == ((C1135rr) this.d).f10539a.getLooper().getThread());
        }
    }
}
