package C0;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0491co;
import com.google.android.gms.internal.ads.C0951ne;
import com.google.android.gms.internal.ads.C1029pC;
import com.google.android.gms.internal.ads.Cu;
import com.google.android.gms.internal.ads.InterfaceC1243uC;
import com.google.android.gms.internal.ads.NC;
import d1.AbstractC1651b;
import java.util.List;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001a0 implements Cu, InterfaceC1243uC {

    /* renamed from: o, reason: collision with root package name */
    public boolean f273o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f274p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f275q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f276r;

    /* renamed from: s, reason: collision with root package name */
    public Object f277s;

    /* renamed from: t, reason: collision with root package name */
    public Object f278t;

    public C0001a0(v0 v0Var, ViewGroup viewGroup) {
        this.f278t = v0Var;
        this.f277s = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.learning_recycler);
        boolean H3 = AbstractC1806a.H(viewGroup.getContext());
        this.f274p = H3;
        this.f275q = (ScrollView) viewGroup.findViewById(R.id.learn_scroller);
        this.f276r = (ViewGroup) viewGroup.findViewById(R.id.learn_container);
        Y y = new Y(this);
        recyclerView.setAdapter(y);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        y.d = AbstractC1651b.b();
        if (H3) {
            viewGroup.findViewById(R.id.learn_container_scroll).setVisibility(0);
        }
    }

    public C0001a0(D0.p pVar, ViewGroup viewGroup) {
        this.f278t = pVar;
        this.f277s = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.learning_recycler);
        boolean H3 = AbstractC1806a.H(viewGroup.getContext());
        this.f274p = H3;
        this.f275q = (ScrollView) viewGroup.findViewById(R.id.learn_scroller);
        this.f276r = (ViewGroup) viewGroup.findViewById(R.id.learn_container);
        Y y = new Y(this, (byte) 0);
        recyclerView.setAdapter(y);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        y.d = AbstractC1651b.b();
        if (H3) {
            viewGroup.findViewById(R.id.learn_container_scroll).setVisibility(0);
        }
    }

    public /* synthetic */ C0001a0(C0491co c0491co, String str, List list, Bundle bundle, boolean z4, boolean z5) {
        this.f275q = c0491co;
        this.f276r = str;
        this.f277s = list;
        this.f278t = bundle;
        this.f273o = z4;
        this.f274p = z5;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.NC, java.lang.Object] */
    public C0001a0(C1029pC c1029pC) {
        this.f276r = c1029pC;
        ?? obj = new Object();
        obj.f6310r = C0951ne.d;
        this.f275q = obj;
        this.f273o = true;
    }

    public static void a(C0001a0 c0001a0, boolean z4) {
        D0.p pVar = (D0.p) c0001a0.f278t;
        ViewGroup viewGroup = (ViewGroup) c0001a0.f277s;
        int visibility = viewGroup.getVisibility();
        int i4 = z4 ? 0 : 8;
        if (visibility == i4) {
            if (visibility != 0 || c0001a0.f273o) {
                return;
            }
            D0.p.R(pVar, R.id.learning_tab);
            return;
        }
        if (i4 != 0) {
            c0001a0.f273o = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100L);
            viewGroup.startAnimation(alphaAnimation);
            viewGroup.postDelayed(new A0.a(25, c0001a0), 100L);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(100L);
        viewGroup.setVisibility(0);
        viewGroup.startAnimation(alphaAnimation2);
        D0.p.S(pVar, pVar.f620i0);
        D0.p.R(pVar, R.id.learning_tab);
    }

    public static void d(C0001a0 c0001a0, boolean z4) {
        v0 v0Var = (v0) c0001a0.f278t;
        ViewGroup viewGroup = (ViewGroup) c0001a0.f277s;
        int visibility = viewGroup.getVisibility();
        int i4 = z4 ? 0 : 8;
        if (visibility == i4) {
            if (visibility != 0 || c0001a0.f273o) {
                return;
            }
            v0.R(v0Var, R.id.learning_tab);
            return;
        }
        if (i4 != 0) {
            c0001a0.f273o = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100L);
            viewGroup.startAnimation(alphaAnimation);
            viewGroup.postDelayed(new A0.a(14, c0001a0), 100L);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(100L);
        viewGroup.setVisibility(0);
        viewGroup.startAnimation(alphaAnimation2);
        v0.S(v0Var, v0Var.f428j0);
        v0.R(v0Var, R.id.learning_tab);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public long b() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(7:5|6|7|8|(1:10)(1:47)|11|(2:13|(4:15|89|25|26)(1:34))(3:35|(1:37)|(2:39|(2:41|42)(2:43|44))(2:45|46))))|51|52|11|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006b, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("Couldn't create RTB adapter : ", r0);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    @Override // com.google.android.gms.internal.ads.Cu
    /* renamed from: b, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c3.InterfaceFutureC0239a mo0b() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.C0001a0.mo0b():c3.a");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public void c(C0951ne c0951ne) {
        InterfaceC1243uC interfaceC1243uC = (InterfaceC1243uC) this.f278t;
        if (interfaceC1243uC != null) {
            interfaceC1243uC.c(c0951ne);
            c0951ne = ((InterfaceC1243uC) this.f278t).e();
        }
        ((NC) this.f275q).c(c0951ne);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public C0951ne e() {
        InterfaceC1243uC interfaceC1243uC = (InterfaceC1243uC) this.f278t;
        return interfaceC1243uC != null ? interfaceC1243uC.e() : ((NC) this.f275q).f6310r;
    }
}
