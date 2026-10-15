package f;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m implements Window.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final Window.Callback f12850o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f12851p;

    public m(q qVar, Window.Callback callback) {
        this.f12851p = qVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f12850o = callback;
    }

    public final boolean a(int i4, Menu menu) {
        return this.f12850o.onMenuOpened(i4, menu);
    }

    public final void b(int i4, Menu menu) {
        this.f12850o.onPanelClosed(i4, menu);
    }

    public final void c(List list, Menu menu, int i4) {
        this.f12850o.onProvideKeyboardShortcuts(list, menu, i4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f12850o.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f12851p.o(keyEvent) || this.f12850o.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f12850o
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            f.q r2 = r6.f12851p
            r2.u()
            f.w r3 = r2.f12913w
            r4 = 0
            if (r3 == 0) goto L3d
            f.v r3 = r3.f12943p
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            k.m r3 = r3.f12924r
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            f.p r0 = r2.f12890U
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.x(r0, r3, r7)
            if (r0 == 0) goto L52
            f.p r7 = r2.f12890U
            if (r7 == 0) goto L3b
            r7.f12863l = r1
            goto L3b
        L52:
            f.p r0 = r2.f12890U
            if (r0 != 0) goto L6a
            f.p r0 = r2.t(r4)
            r2.y(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.x(r0, r3, r7)
            r0.f12862k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f12850o.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f12850o.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f12850o.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f12850o.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f12850o.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f12850o.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0 || (menu instanceof k.m)) {
            return this.f12850o.onCreatePanelMenu(i4, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i4) {
        return this.f12850o.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f12850o.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f12850o.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i4, Menu menu) {
        a(i4, menu);
        if (i4 == 108) {
            q qVar = this.f12851p;
            qVar.u();
            w wVar = qVar.f12913w;
            if (wVar != null) {
                ArrayList arrayList = wVar.f12947t;
                if (true != wVar.f12946s) {
                    wVar.f12946s = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        b(i4, menu);
        q qVar = this.f12851p;
        if (i4 != 108) {
            if (i4 == 0) {
                p t4 = qVar.t(i4);
                if (t4.f12864m) {
                    qVar.n(t4, false);
                    return;
                }
                return;
            }
            return;
        }
        qVar.u();
        w wVar = qVar.f12913w;
        if (wVar != null) {
            ArrayList arrayList = wVar.f12947t;
            if (wVar.f12946s) {
                wVar.f12946s = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        this.f12850o.onPointerCaptureChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        k.m mVar = menu instanceof k.m ? (k.m) menu : null;
        if (i4 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f13447x = true;
        }
        boolean onPreparePanel = this.f12850o.onPreparePanel(i4, view, menu);
        if (mVar != null) {
            mVar.f13447x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        k.m mVar = this.f12851p.t(0).f12859h;
        if (mVar != null) {
            c(list, mVar, i4);
        } else {
            c(list, menu, i4);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f12850o.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f12850o.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f12850o.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f12850o.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee  */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.google.android.gms.internal.ads.Qb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j.d, k.k, java.lang.Object, j.a] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r11, int r12) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }
}
