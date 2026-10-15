package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0154c extends AbstractComponentCallbacksC0157f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: g0, reason: collision with root package name */
    public int f2800g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f2801h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f2802i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f2803j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f2804k0;

    /* renamed from: l0, reason: collision with root package name */
    public Dialog f2805l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2806m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2807n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f2808o0;

    public DialogInterfaceOnCancelListenerC0154c() {
        new D0.o(14, this);
        this.f2800g0 = 0;
        this.f2801h0 = 0;
        this.f2802i0 = true;
        this.f2803j0 = true;
        this.f2804k0 = -1;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public void A() {
        this.f2833P = true;
        Dialog dialog = this.f2805l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog K() {
        return new Dialog(D(), this.f2801h0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void n(Bundle bundle) {
        Bundle bundle2;
        this.f2833P = true;
        if (this.f2803j0) {
            View view = this.f2835R;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f2805l0.setContentView(view);
            }
            AbstractActivityC1671f h4 = h();
            if (h4 != null) {
                this.f2805l0.setOwnerActivity(h4);
            }
            this.f2805l0.setCancelable(this.f2802i0);
            this.f2805l0.setOnCancelListener(this);
            this.f2805l0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f2805l0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2806m0 || this.f2807n0) {
            return;
        }
        this.f2807n0 = true;
        this.f2808o0 = false;
        Dialog dialog = this.f2805l0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2805l0.dismiss();
        }
        this.f2806m0 = true;
        int i4 = this.f2804k0;
        if (i4 >= 0) {
            s sVar = this.f2823E;
            if (sVar == null) {
                throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
            }
            if (i4 < 0) {
                throw new IllegalArgumentException(U.a.i("Bad id: ", i4));
            }
            sVar.I(new q(sVar, i4), false);
            this.f2804k0 = -1;
            return;
        }
        s sVar2 = this.f2823E;
        if (sVar2 == null) {
            throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
        }
        C0152a c0152a = new C0152a(sVar2);
        s sVar3 = this.f2823E;
        if (sVar3 == null || sVar3 == c0152a.f2783r) {
            c0152a.b(new w(3, this));
            c0152a.e(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void p(Context context) {
        super.p(context);
        if (this.f2808o0) {
            return;
        }
        this.f2807n0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public void q(Bundle bundle) {
        super.q(bundle);
        new Handler();
        this.f2803j0 = this.f2828J == 0;
        if (bundle != null) {
            this.f2800g0 = bundle.getInt("android:style", 0);
            this.f2801h0 = bundle.getInt("android:theme", 0);
            this.f2802i0 = bundle.getBoolean("android:cancelable", true);
            this.f2803j0 = bundle.getBoolean("android:showsDialog", this.f2803j0);
            this.f2804k0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void s() {
        this.f2833P = true;
        Dialog dialog = this.f2805l0;
        if (dialog != null) {
            this.f2806m0 = true;
            dialog.setOnDismissListener(null);
            this.f2805l0.dismiss();
            if (!this.f2807n0) {
                onDismiss(this.f2805l0);
            }
            this.f2805l0 = null;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void t() {
        this.f2833P = true;
        if (this.f2808o0 || this.f2807n0) {
            return;
        }
        this.f2807n0 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final LayoutInflater u(Bundle bundle) {
        if (!this.f2803j0) {
            return super.u(bundle);
        }
        Dialog K2 = K();
        this.f2805l0 = K2;
        if (K2 == null) {
            return (LayoutInflater) this.f2824F.f2861q.getSystemService("layout_inflater");
        }
        int i4 = this.f2800g0;
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                K2.getWindow().addFlags(24);
            }
            return (LayoutInflater) this.f2805l0.getContext().getSystemService("layout_inflater");
        }
        K2.requestWindowFeature(1);
        return (LayoutInflater) this.f2805l0.getContext().getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public void y(Bundle bundle) {
        Bundle onSaveInstanceState;
        Dialog dialog = this.f2805l0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i4 = this.f2800g0;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i5 = this.f2801h0;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z4 = this.f2802i0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z5 = this.f2803j0;
        if (!z5) {
            bundle.putBoolean("android:showsDialog", z5);
        }
        int i6 = this.f2804k0;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public void z() {
        this.f2833P = true;
        Dialog dialog = this.f2805l0;
        if (dialog != null) {
            this.f2806m0 = false;
            dialog.show();
        }
    }
}
