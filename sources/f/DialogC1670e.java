package f;

import C0.ViewOnClickListenerC0022w;
import H.A;
import H.AbstractC0045u;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import d3.AbstractC1654b;
import j.C1728j;
import java.util.WeakHashMap;
import l.Z;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC1670e extends Dialog implements DialogInterface, InterfaceC1672g {

    /* renamed from: o, reason: collision with root package name */
    public q f12829o;

    /* renamed from: p, reason: collision with root package name */
    public final r f12830p;

    /* renamed from: q, reason: collision with root package name */
    public final C1669d f12831q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC1670e(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = c(r5, r6)
            r0 = 1
            r1 = 2130903268(0x7f0300e4, float:1.741335E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            f.r r2 = new f.r
            r2.<init>(r4)
            r4.f12830p = r2
            f.h r2 = r4.a()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            f.q r5 = (f.q) r5
            r5.f12896a0 = r6
            r2.b()
            f.d r5 = new f.d
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f12831q = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.DialogC1670e.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int c(Context context, int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final h a() {
        if (this.f12829o == null) {
            int i4 = h.f12841o;
            this.f12829o = new q(getContext(), getWindow(), this, this);
        }
        return this.f12829o;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) a();
        qVar.q();
        ((ViewGroup) qVar.f12879I.findViewById(android.R.id.content)).addView(view, layoutParams);
        qVar.f12911u.f12850o.onContentChanged();
    }

    public final void b(Bundle bundle) {
        a().a();
        super.onCreate(bundle);
        a().b();
    }

    public final void d(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().h(charSequence);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1654b.s(this.f12830p, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i4) {
        q qVar = (q) a();
        qVar.q();
        return qVar.f12910t.findViewById(i4);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        q qVar = (q) a();
        qVar.u();
        qVar.v(0);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i4;
        ListAdapter listAdapter;
        View findViewById;
        b(bundle);
        C1669d c1669d = this.f12831q;
        c1669d.f12807b.setContentView(c1669d.f12828z);
        Context context = c1669d.f12806a;
        Window window = c1669d.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = c1669d.f12810g;
        if (view == null) {
            view = null;
        }
        boolean z4 = view != null;
        if (!z4 || !C1669d.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c1669d.f12811h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c1669d.f12809f != null) {
                ((Z) viewGroup.getLayoutParams()).f13700a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b4 = C1669d.b(findViewById6, findViewById3);
        ViewGroup b5 = C1669d.b(findViewById7, findViewById4);
        ViewGroup b6 = C1669d.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1669d.f12821r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1669d.f12821r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b5.findViewById(android.R.id.message);
        c1669d.f12825v = textView;
        if (textView != null) {
            CharSequence charSequence = c1669d.f12808e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c1669d.f12821r.removeView(c1669d.f12825v);
                if (c1669d.f12809f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c1669d.f12821r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c1669d.f12821r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c1669d.f12809f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b5.setVisibility(8);
                }
            }
        }
        Button button = (Button) b6.findViewById(android.R.id.button1);
        c1669d.f12812i = button;
        ViewOnClickListenerC0022w viewOnClickListenerC0022w = c1669d.f12805F;
        button.setOnClickListener(viewOnClickListenerC0022w);
        if (TextUtils.isEmpty(c1669d.f12813j)) {
            c1669d.f12812i.setVisibility(8);
            i4 = 0;
        } else {
            c1669d.f12812i.setText(c1669d.f12813j);
            c1669d.f12812i.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) b6.findViewById(android.R.id.button2);
        c1669d.f12815l = button2;
        button2.setOnClickListener(viewOnClickListenerC0022w);
        if (TextUtils.isEmpty(c1669d.f12816m)) {
            c1669d.f12815l.setVisibility(8);
        } else {
            c1669d.f12815l.setText(c1669d.f12816m);
            c1669d.f12815l.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) b6.findViewById(android.R.id.button3);
        c1669d.f12818o = button3;
        button3.setOnClickListener(viewOnClickListenerC0022w);
        if (TextUtils.isEmpty(c1669d.f12819p)) {
            c1669d.f12818o.setVisibility(8);
        } else {
            c1669d.f12818o.setText(c1669d.f12819p);
            c1669d.f12818o.setVisibility(0);
            i4 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i4 == 1) {
                Button button4 = c1669d.f12812i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i4 == 2) {
                Button button5 = c1669d.f12815l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i4 == 4) {
                Button button6 = c1669d.f12818o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i4 == 0) {
            b6.setVisibility(8);
        }
        if (c1669d.f12826w != null) {
            b4.addView(c1669d.f12826w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c1669d.f12823t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c1669d.d) || !c1669d.f12803D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c1669d.f12823t.setVisibility(8);
                b4.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c1669d.f12824u = textView2;
                textView2.setText(c1669d.d);
                Drawable drawable = c1669d.f12822s;
                if (drawable != null) {
                    c1669d.f12823t.setImageDrawable(drawable);
                } else {
                    c1669d.f12824u.setPadding(c1669d.f12823t.getPaddingLeft(), c1669d.f12823t.getPaddingTop(), c1669d.f12823t.getPaddingRight(), c1669d.f12823t.getPaddingBottom());
                    c1669d.f12823t.setVisibility(8);
                }
            }
        }
        boolean z5 = viewGroup.getVisibility() != 8;
        int i5 = (b4 == null || b4.getVisibility() == 8) ? 0 : 1;
        boolean z6 = b6.getVisibility() != 8;
        if (!z6 && (findViewById = b5.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = c1669d.f12821r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (c1669d.f12808e == null && c1669d.f12809f == null) ? null : b4.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b5.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1669d.f12809f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z6 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f2446o, alertController$RecycleListView.getPaddingRight(), z6 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f2447p);
            }
        }
        if (!z5) {
            View view2 = c1669d.f12809f;
            if (view2 == null) {
                view2 = c1669d.f12821r;
            }
            if (view2 != null) {
                int i6 = z6 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = A.f779a;
                AbstractC0045u.b(view2, i5 | i6, 3);
                if (findViewById11 != null) {
                    b5.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b5.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c1669d.f12809f;
        if (alertController$RecycleListView2 == null || (listAdapter = c1669d.f12827x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = c1669d.y;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12831q.f12821r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12831q.f12821r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        q qVar = (q) a();
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

    @Override // android.app.Dialog
    public final void setContentView(int i4) {
        a().e(i4);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        q qVar = (q) a();
        qVar.q();
        ViewGroup viewGroup = (ViewGroup) qVar.f12879I.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        qVar.f12911u.f12850o.onContentChanged();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) a();
        qVar.q();
        ViewGroup viewGroup = (ViewGroup) qVar.f12879I.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        qVar.f12911u.f12850o.onContentChanged();
    }

    @Override // android.app.Dialog
    public final void setTitle(int i4) {
        super.setTitle(i4);
        a().h(getContext().getString(i4));
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        d(charSequence);
        C1669d c1669d = this.f12831q;
        c1669d.d = charSequence;
        TextView textView = c1669d.f12824u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
