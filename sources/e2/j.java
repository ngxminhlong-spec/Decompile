package e2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0154c {

    /* renamed from: p0, reason: collision with root package name */
    public Dialog f12760p0;

    /* renamed from: q0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f12761q0;

    /* renamed from: r0, reason: collision with root package name */
    public AlertDialog f12762r0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c
    public final Dialog K() {
        Dialog dialog = this.f12760p0;
        if (dialog != null) {
            return dialog;
        }
        this.f2803j0 = false;
        if (this.f12762r0 == null) {
            Context l4 = l();
            y.i(l4);
            this.f12762r0 = new AlertDialog.Builder(l4).create();
        }
        return this.f12762r0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12761q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
