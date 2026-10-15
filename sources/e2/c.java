package e2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: o, reason: collision with root package name */
    public Dialog f12746o;

    /* renamed from: p, reason: collision with root package name */
    public DialogInterface.OnCancelListener f12747p;

    /* renamed from: q, reason: collision with root package name */
    public AlertDialog f12748q;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12747p;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f12746o;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f12748q == null) {
            Activity activity = getActivity();
            y.i(activity);
            this.f12748q = new AlertDialog.Builder(activity).create();
        }
        return this.f12748q;
    }
}
