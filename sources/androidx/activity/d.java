package androidx.activity;

import A2.o;
import H.InterfaceC0030e;
import Q1.H;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import d3.AbstractC1654b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class d extends Activity implements w, f0.d, i, InterfaceC0030e {

    /* renamed from: o */
    public final k f2413o = new k(this);

    /* renamed from: p */
    public final D3.d f2414p = new D3.d(26);

    /* renamed from: q */
    public final k f2415q;

    /* renamed from: r */
    public final o f2416r;

    /* renamed from: s */
    public v f2417s;

    /* renamed from: t */
    public final f f2418t;

    /* renamed from: u */
    public final AtomicInteger f2419u;

    /* renamed from: v */
    public final b f2420v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.lifecycle.h, androidx.activity.ImmLeaksCleaner, java.lang.Object] */
    public d() {
        k kVar = new k(this);
        this.f2415q = kVar;
        this.f2416r = new o(this);
        this.f2418t = new f(new D0.o(13, this));
        this.f2419u = new AtomicInteger();
        this.f2420v = new b(this);
        int i4 = Build.VERSION.SDK_INT;
        kVar.a(new h() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.h
            public final void a(i iVar, androidx.lifecycle.f fVar) {
                if (fVar == androidx.lifecycle.f.ON_STOP) {
                    Window window = d.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        kVar.a(new h() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.h
            public final void a(i iVar, androidx.lifecycle.f fVar) {
                if (fVar == androidx.lifecycle.f.ON_DESTROY) {
                    d dVar = d.this;
                    dVar.f2414p.getClass();
                    if (dVar.isChangingConfigurations()) {
                        return;
                    }
                    dVar.e().a();
                }
            }
        });
        kVar.a(new h() { // from class: androidx.activity.ComponentActivity$5
            @Override // androidx.lifecycle.h
            public final void a(i iVar, androidx.lifecycle.f fVar) {
                d dVar = d.this;
                if (dVar.f2417s == null) {
                    c cVar = (c) dVar.getLastNonConfigurationInstance();
                    if (cVar != null) {
                        dVar.f2417s = cVar.f2412a;
                    }
                    if (dVar.f2417s == null) {
                        dVar.f2417s = new v();
                    }
                }
                dVar.f2415q.f(this);
            }
        });
        if (i4 <= 23) {
            ?? obj = new Object();
            obj.f2406o = this;
            kVar.a(obj);
        }
    }

    public static /* synthetic */ void h(d dVar) {
        super.onBackPressed();
    }

    @Override // f0.d
    public final H a() {
        return (H) this.f2416r.f37r;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        super.addContentView(view, layoutParams);
    }

    @Override // H.InterfaceC0030e
    public final boolean b(KeyEvent keyEvent) {
        S3.e.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        S3.e.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        S3.e.d(decorView, "getDecorView(...)");
        if (AbstractC1654b.r(decorView, keyEvent)) {
            return true;
        }
        return AbstractC1654b.s(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        S3.e.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        S3.e.d(decorView, "getDecorView(...)");
        if (AbstractC1654b.r(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.w
    public final v e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2417s == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f2417s = cVar.f2412a;
            }
            if (this.f2417s == null) {
                this.f2417s = new v();
            }
        }
        return this.f2417s;
    }

    @Override // androidx.lifecycle.i
    public final k f() {
        return this.f2415q;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        S3.e.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        S3.e.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        S3.e.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = r.f2990o;
        p.b(this);
    }

    public final void k(Bundle bundle) {
        S3.e.e(bundle, "outState");
        k kVar = this.f2413o;
        kVar.c("setCurrentState");
        kVar.e(g.f2970q);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (this.f2420v.a(i4, i5, intent)) {
            return;
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f2418t.b();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2416r.a(bundle);
        Iterator it = ((CopyOnWriteArraySet) this.f2414p.f677p).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        j(bundle);
        b bVar = this.f2420v;
        bVar.getClass();
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                int size = stringArrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Integer num = integerArrayList.get(i4);
                    num.intValue();
                    String str = stringArrayList.get(i4);
                    bVar.f2437b.put(num, str);
                    bVar.c.put(str, num);
                }
                bVar.f2438e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                bVar.f2436a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                bVar.f2441h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        int i5 = r.f2990o;
        p.b(this);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (this.f2420v.a(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.activity.c, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        v vVar = this.f2417s;
        if (vVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            vVar = cVar.f2412a;
        }
        if (vVar == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f2412a = vVar;
        return obj;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        k kVar = this.f2415q;
        if (kVar != null) {
            kVar.c("setCurrentState");
            kVar.e(g.f2970q);
        }
        k(bundle);
        this.f2416r.b(bundle);
        b bVar = this.f2420v;
        bVar.getClass();
        HashMap hashMap = bVar.f2437b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(bVar.f2438e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar.f2441h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar.f2436a);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC1806a.D()) {
                AbstractC1806a.f("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        i();
        super.setContentView(i4);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        i();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        super.setContentView(view, layoutParams);
    }
}
