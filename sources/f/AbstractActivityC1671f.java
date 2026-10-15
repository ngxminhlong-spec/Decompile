package f;

import android.R;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractComponentCallbacksC0157f;
import androidx.fragment.app.C0158g;
import j.C1726h;
import j.C1728j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.G0;
import l.K0;
import s.AbstractC1969a;
import x.InterfaceC2054a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: f.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1671f extends androidx.activity.d implements InterfaceC1672g, InterfaceC2054a {

    /* renamed from: B, reason: collision with root package name */
    public boolean f12833B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f12834C;

    /* renamed from: D, reason: collision with root package name */
    public int f12835D;

    /* renamed from: E, reason: collision with root package name */
    public r.j f12836E;

    /* renamed from: F, reason: collision with root package name */
    public q f12837F;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12840z;

    /* renamed from: w, reason: collision with root package name */
    public final x0.f f12838w = new x0.f(24, new C0158g(this));

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.k f12839x = new androidx.lifecycle.k(this);

    /* renamed from: A, reason: collision with root package name */
    public boolean f12832A = true;

    public static void m(int i4) {
        if ((i4 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean p(androidx.fragment.app.s sVar) {
        List<AbstractComponentCallbacksC0157f> list;
        if (sVar.f2906t.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            synchronized (sVar.f2906t) {
                list = (List) sVar.f2906t.clone();
            }
        }
        boolean z4 = false;
        for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f : list) {
            if (abstractComponentCallbacksC0157f != null) {
                if (abstractComponentCallbacksC0157f.f2845b0.c.a()) {
                    androidx.lifecycle.k kVar = abstractComponentCallbacksC0157f.f2845b0;
                    androidx.lifecycle.g gVar = androidx.lifecycle.g.f2970q;
                    kVar.c("setCurrentState");
                    kVar.e(gVar);
                    z4 = true;
                }
                C0158g c0158g = abstractComponentCallbacksC0157f.f2824F;
                if ((c0158g == null ? null : c0158g.f2864t) != null) {
                    z4 |= p(abstractComponentCallbacksC0157f.k());
                }
            }
        }
        return z4;
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) n();
        qVar.q();
        ((ViewGroup) qVar.f12879I.findViewById(R.id.content)).addView(view, layoutParams);
        qVar.f12911u.f12850o.onContentChanged();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        q qVar = (q) n();
        qVar.j(false);
        qVar.f12892W = true;
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((q) n()).u();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.activity.d, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((q) n()).u();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.y);
        printWriter.print(" mResumed=");
        printWriter.print(this.f12840z);
        printWriter.print(" mStopped=");
        printWriter.print(this.f12832A);
        if (getApplication() != null) {
            r.j jVar = ((S.a) new q2.e(e(), S.a.d).l(S.a.class)).c;
            if (jVar.f() > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (jVar.f() > 0) {
                    if (jVar.g(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(jVar.d(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0158g) this.f12838w.f15212p).f2863s.H(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i4) {
        q qVar = (q) n();
        qVar.q();
        return qVar.f12910t.findViewById(i4);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        q qVar = (q) n();
        if (qVar.f12914x == null) {
            qVar.u();
            w wVar = qVar.f12913w;
            qVar.f12914x = new C1726h(wVar != null ? wVar.k0() : qVar.f12909s);
        }
        return qVar.f12914x;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i4 = K0.f13647a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        q qVar = (q) n();
        qVar.u();
        qVar.v(0);
    }

    public final int l(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        if (this.f12836E.f() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (true) {
            r.j jVar = this.f12836E;
            int i4 = this.f12835D;
            if (jVar.f14742o) {
                r.h.a(jVar);
            }
            if (AbstractC1969a.a(jVar.f14745r, i4, jVar.f14743p) < 0) {
                int i5 = this.f12835D;
                this.f12836E.e(i5, abstractComponentCallbacksC0157f.f2852r);
                this.f12835D = (this.f12835D + 1) % 65534;
                return i5;
            }
            this.f12835D = (this.f12835D + 1) % 65534;
        }
    }

    public final h n() {
        if (this.f12837F == null) {
            int i4 = h.f12841o;
            this.f12837F = new q(this, null, this, this);
        }
        return this.f12837F;
    }

    public final androidx.fragment.app.s o() {
        return ((C0158g) this.f12838w.f15212p).f2863s;
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        x0.f fVar = this.f12838w;
        fVar.x();
        int i6 = i4 >> 16;
        if (i6 == 0) {
            super.onActivityResult(i4, i5, intent);
            return;
        }
        int i7 = i6 - 1;
        String str = (String) this.f12836E.c(i7);
        r.j jVar = this.f12836E;
        int a4 = AbstractC1969a.a(jVar.f14745r, i7, jVar.f14743p);
        if (a4 >= 0) {
            Object[] objArr = jVar.f14744q;
            Object obj = objArr[a4];
            Object obj2 = r.h.f14738b;
            if (obj != obj2) {
                objArr[a4] = obj2;
                jVar.f14742o = true;
            }
        }
        if (str == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        AbstractComponentCallbacksC0157f O4 = ((C0158g) fVar.f15212p).f2863s.O(str);
        if (O4 == null) {
            Log.w("FragmentActivity", "Activity result no fragment exists for who: ".concat(str));
        } else {
            O4.o(i4 & 65535, i5, intent);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        q(configuration);
        q qVar = (q) n();
        if (qVar.N && qVar.f12878H) {
            qVar.u();
            w wVar = qVar.f12913w;
            if (wVar != null) {
                wVar.n0(wVar.f12935h.getResources().getBoolean(com.duracodefactory.logiccircuitsimulatorpro.R.bool.abc_action_bar_embed_tabs));
            }
        }
        l.r a4 = l.r.a();
        Context context = qVar.f12909s;
        synchronized (a4) {
            a4.f13821a.k(context);
        }
        qVar.j(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.activity.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        h n4 = n();
        n4.a();
        n4.b();
        r(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0) {
            return super.onCreatePanelMenu(i4, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i4, menu);
        getMenuInflater();
        return onCreatePanelMenu | ((C0158g) this.f12838w.f15212p).f2863s.i();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0158g) this.f12838w.f15212p).f2863s.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0158g) this.f12838w.f15212p).f2863s.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        s();
        q qVar = (q) n();
        qVar.getClass();
        synchronized (h.f12843q) {
            h.c(qVar);
        }
        if (qVar.f12901f0) {
            qVar.f12910t.getDecorView().removeCallbacks(qVar.f12903h0);
        }
        qVar.f12893X = false;
        qVar.f12894Y = true;
        n nVar = qVar.f12899d0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = qVar.f12900e0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((C0158g) this.f12838w.f15212p).f2863s.k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        Intent j4;
        if (!t(i4, menuItem)) {
            q qVar = (q) n();
            qVar.u();
            w wVar = qVar.f12913w;
            if (menuItem.getItemId() != 16908332 || wVar == null || (((G0) wVar.f12939l).f13604b & 4) == 0 || (j4 = android.support.v4.media.session.a.j(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(j4)) {
                navigateUpTo(j4);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent j5 = android.support.v4.media.session.a.j(this);
            if (j5 == null) {
                j5 = android.support.v4.media.session.a.j(this);
            }
            if (j5 != null) {
                ComponentName component = j5.getComponent();
                if (component == null) {
                    component = j5.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent k3 = android.support.v4.media.session.a.k(this, component);
                    while (k3 != null) {
                        arrayList.add(size, k3);
                        k3 = android.support.v4.media.session.a.k(this, k3.getComponent());
                    }
                    arrayList.add(j5);
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e4);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4) {
        ((C0158g) this.f12838w.f15212p).f2863s.l();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f12838w.x();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        u(i4, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f12840z = false;
        ((C0158g) this.f12838w.f15212p).f2863s.F(3);
        this.f12839x.d(androidx.lifecycle.f.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4) {
        ((C0158g) this.f12838w.f15212p).f2863s.D();
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((q) n()).q();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        v();
        q qVar = (q) n();
        qVar.u();
        w wVar = qVar.f12913w;
        if (wVar != null) {
            wVar.f12930A = true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        return i4 == 0 ? super.onPreparePanel(0, view, menu) | ((C0158g) this.f12838w.f15212p).f2863s.E() : super.onPreparePanel(i4, view, menu);
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        x0.f fVar = this.f12838w;
        fVar.x();
        int i5 = (i4 >> 16) & 65535;
        if (i5 != 0) {
            int i6 = i5 - 1;
            String str = (String) this.f12836E.c(i6);
            r.j jVar = this.f12836E;
            int a4 = AbstractC1969a.a(jVar.f14745r, i6, jVar.f14743p);
            if (a4 >= 0) {
                Object[] objArr = jVar.f14744q;
                Object obj = objArr[a4];
                Object obj2 = r.h.f14738b;
                if (obj != obj2) {
                    objArr[a4] = obj2;
                    jVar.f14742o = true;
                }
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            AbstractComponentCallbacksC0157f O4 = ((C0158g) fVar.f15212p).f2863s.O(str);
            if (O4 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: ".concat(str));
            } else {
                O4.w(i4 & 65535, strArr, iArr);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f12840z = true;
        x0.f fVar = this.f12838w;
        fVar.x();
        ((C0158g) fVar.f15212p).f2863s.K();
    }

    @Override // androidx.activity.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        w(bundle);
        q qVar = (q) n();
        int i4 = qVar.f12895Z;
        if (i4 != -100) {
            q.f12868m0.put(qVar.f12908r.getClass(), Integer.valueOf(i4));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        x();
        q qVar = (q) n();
        qVar.f12893X = true;
        qVar.j(true);
        synchronized (h.f12843q) {
            h.c(qVar);
            h.f12842p.add(new WeakReference(qVar));
        }
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f12838w.x();
    }

    @Override // android.app.Activity
    public final void onStop() {
        y();
        q qVar = (q) n();
        qVar.f12893X = false;
        synchronized (h.f12843q) {
            h.c(qVar);
        }
        qVar.u();
        w wVar = qVar.f12913w;
        if (wVar != null) {
            wVar.f12930A = false;
            C1728j c1728j = wVar.f12952z;
            if (c1728j != null) {
                c1728j.a();
            }
        }
        if (qVar.f12908r instanceof Dialog) {
            n nVar = qVar.f12899d0;
            if (nVar != null) {
                nVar.c();
            }
            n nVar2 = qVar.f12900e0;
            if (nVar2 != null) {
                nVar2.c();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        n().h(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((q) n()).u();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void q(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x0.f fVar = this.f12838w;
        fVar.x();
        ((C0158g) fVar.f15212p).f2863s.g(configuration);
    }

    public final void r(Bundle bundle) {
        x0.f fVar = this.f12838w;
        C0158g c0158g = (C0158g) fVar.f15212p;
        C0158g c0158g2 = (C0158g) fVar.f15212p;
        c0158g.f2863s.b(c0158g, c0158g, null);
        if (bundle != null) {
            c0158g2.f2863s.e0(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f12835D = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f12836E = new r.j(intArray.length);
                    for (int i4 = 0; i4 < intArray.length; i4++) {
                        this.f12836E.e(intArray[i4], stringArray[i4]);
                    }
                }
            }
        }
        if (this.f12836E == null) {
            this.f12836E = new r.j();
            this.f12835D = 0;
        }
        super.onCreate(bundle);
        this.f12839x.d(androidx.lifecycle.f.ON_CREATE);
        androidx.fragment.app.s sVar = c0158g2.f2863s;
        sVar.f2893I = false;
        sVar.f2894J = false;
        sVar.F(1);
    }

    public final void s() {
        super.onDestroy();
        ((C0158g) this.f12838w.f15212p).f2863s.j();
        this.f12839x.d(androidx.lifecycle.f.ON_DESTROY);
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void setContentView(int i4) {
        n().e(i4);
    }

    @Override // androidx.activity.d, android.app.Activity
    public void setContentView(View view) {
        q qVar = (q) n();
        qVar.q();
        ViewGroup viewGroup = (ViewGroup) qVar.f12879I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        qVar.f12911u.f12850o.onContentChanged();
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) n();
        qVar.q();
        ViewGroup viewGroup = (ViewGroup) qVar.f12879I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        qVar.f12911u.f12850o.onContentChanged();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        super.setTheme(i4);
        ((q) n()).f12896a0 = i4;
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4) {
        if (!this.f12834C && i4 != -1) {
            m(i4);
        }
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        if (!this.f12834C && i4 != -1) {
            m(i4);
        }
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7) {
        if (i4 != -1) {
            m(i4);
        }
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        if (i4 != -1) {
            m(i4);
        }
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public final boolean t(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        x0.f fVar = this.f12838w;
        if (i4 == 0) {
            return ((C0158g) fVar.f15212p).f2863s.A();
        }
        if (i4 != 6) {
            return false;
        }
        return ((C0158g) fVar.f15212p).f2863s.h();
    }

    public final void u(int i4, Menu menu) {
        if (i4 == 0) {
            ((C0158g) this.f12838w.f15212p).f2863s.B();
        }
        super.onPanelClosed(i4, menu);
    }

    public final void v() {
        super.onPostResume();
        this.f12839x.d(androidx.lifecycle.f.ON_RESUME);
        androidx.fragment.app.s sVar = ((C0158g) this.f12838w.f15212p).f2863s;
        sVar.f2893I = false;
        sVar.f2894J = false;
        sVar.F(4);
    }

    public final void w(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (p(o()));
        this.f12839x.d(androidx.lifecycle.f.ON_STOP);
        androidx.fragment.app.t f02 = ((C0158g) this.f12838w.f15212p).f2863s.f0();
        if (f02 != null) {
            bundle.putParcelable("android:support:fragments", f02);
        }
        if (this.f12836E.f() > 0) {
            bundle.putInt("android:support:next_request_index", this.f12835D);
            int[] iArr = new int[this.f12836E.f()];
            String[] strArr = new String[this.f12836E.f()];
            for (int i4 = 0; i4 < this.f12836E.f(); i4++) {
                iArr[i4] = this.f12836E.d(i4);
                strArr[i4] = (String) this.f12836E.g(i4);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public final void x() {
        super.onStart();
        this.f12832A = false;
        boolean z4 = this.y;
        x0.f fVar = this.f12838w;
        if (!z4) {
            this.y = true;
            androidx.fragment.app.s sVar = ((C0158g) fVar.f15212p).f2863s;
            sVar.f2893I = false;
            sVar.f2894J = false;
            sVar.F(2);
        }
        fVar.x();
        C0158g c0158g = (C0158g) fVar.f15212p;
        c0158g.f2863s.K();
        this.f12839x.d(androidx.lifecycle.f.ON_START);
        androidx.fragment.app.s sVar2 = c0158g.f2863s;
        sVar2.f2893I = false;
        sVar2.f2894J = false;
        sVar2.F(3);
    }

    public final void y() {
        super.onStop();
        this.f12832A = true;
        do {
        } while (p(o()));
        androidx.fragment.app.s sVar = ((C0158g) this.f12838w.f15212p).f2863s;
        sVar.f2894J = true;
        sVar.F(2);
        this.f12839x.d(androidx.lifecycle.f.ON_STOP);
    }
}
