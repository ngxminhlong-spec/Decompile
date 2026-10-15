package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import f.DialogC1670e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, y {

    /* renamed from: o, reason: collision with root package name */
    public F f13448o;

    /* renamed from: p, reason: collision with root package name */
    public DialogC1670e f13449p;

    /* renamed from: q, reason: collision with root package name */
    public i f13450q;

    @Override // k.y
    public final void a(m mVar, boolean z4) {
        DialogC1670e dialogC1670e;
        if ((z4 || mVar == this.f13448o) && (dialogC1670e = this.f13449p) != null) {
            dialogC1670e.dismiss();
        }
    }

    @Override // k.y
    public final boolean d(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        F f4 = this.f13448o;
        i iVar = this.f13450q;
        if (iVar.f13419t == null) {
            iVar.f13419t = new h(iVar);
        }
        f4.q(iVar.f13419t.getItem(i4), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f13450q.a(this.f13448o, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        F f4 = this.f13448o;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f13449p.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f13449p.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                f4.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return f4.performShortcut(i4, keyEvent, 0);
    }
}
