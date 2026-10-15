package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import f.C1667b;
import f.DialogC1670e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C implements H, DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public DialogC1670e f13583o;

    /* renamed from: p, reason: collision with root package name */
    public D f13584p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f13585q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f13586r;

    public C(I i4) {
        this.f13586r = i4;
    }

    @Override // l.H
    public final boolean b() {
        DialogC1670e dialogC1670e = this.f13583o;
        if (dialogC1670e != null) {
            return dialogC1670e.isShowing();
        }
        return false;
    }

    @Override // l.H
    public final int c() {
        return 0;
    }

    @Override // l.H
    public final void dismiss() {
        DialogC1670e dialogC1670e = this.f13583o;
        if (dialogC1670e != null) {
            dialogC1670e.dismiss();
            this.f13583o = null;
        }
    }

    @Override // l.H
    public final Drawable f() {
        return null;
    }

    @Override // l.H
    public final void g(CharSequence charSequence) {
        this.f13585q = charSequence;
    }

    @Override // l.H
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.H
    public final void j(int i4) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.H
    public final void k(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // l.H
    public final void l(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.H
    public final void m(int i4, int i5) {
        if (this.f13584p == null) {
            return;
        }
        I i6 = this.f13586r;
        B0.r rVar = new B0.r(i6.getPopupContext());
        C1667b c1667b = (C1667b) rVar.f113p;
        CharSequence charSequence = this.f13585q;
        if (charSequence != null) {
            c1667b.d = charSequence;
        }
        D d = this.f13584p;
        int selectedItemPosition = i6.getSelectedItemPosition();
        c1667b.f12795l = d;
        c1667b.f12796m = this;
        c1667b.f12799p = selectedItemPosition;
        c1667b.f12798o = true;
        DialogC1670e i7 = rVar.i();
        this.f13583o = i7;
        AlertController$RecycleListView alertController$RecycleListView = i7.f12831q.f12809f;
        alertController$RecycleListView.setTextDirection(i4);
        alertController$RecycleListView.setTextAlignment(i5);
        this.f13583o.show();
    }

    @Override // l.H
    public final int n() {
        return 0;
    }

    @Override // l.H
    public final CharSequence o() {
        return this.f13585q;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        I i5 = this.f13586r;
        i5.setSelection(i4);
        if (i5.getOnItemClickListener() != null) {
            i5.performItemClick(null, i4, this.f13584p.getItemId(i4));
        }
        dismiss();
    }

    @Override // l.H
    public final void p(ListAdapter listAdapter) {
        this.f13584p = (D) listAdapter;
    }
}
