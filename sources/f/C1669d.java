package f;

import C0.ViewOnClickListenerC0022w;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.JD;
import e.AbstractC1657a;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1669d {

    /* renamed from: A, reason: collision with root package name */
    public final int f12800A;

    /* renamed from: B, reason: collision with root package name */
    public final int f12801B;

    /* renamed from: C, reason: collision with root package name */
    public final int f12802C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f12803D;

    /* renamed from: E, reason: collision with root package name */
    public final JD f12804E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12806a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogC1670e f12807b;
    public final Window c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f12808e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f12809f;

    /* renamed from: g, reason: collision with root package name */
    public View f12810g;

    /* renamed from: i, reason: collision with root package name */
    public Button f12812i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f12813j;

    /* renamed from: k, reason: collision with root package name */
    public Message f12814k;

    /* renamed from: l, reason: collision with root package name */
    public Button f12815l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f12816m;

    /* renamed from: n, reason: collision with root package name */
    public Message f12817n;

    /* renamed from: o, reason: collision with root package name */
    public Button f12818o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f12819p;

    /* renamed from: q, reason: collision with root package name */
    public Message f12820q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f12821r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f12822s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f12823t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f12824u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f12825v;

    /* renamed from: w, reason: collision with root package name */
    public View f12826w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f12827x;

    /* renamed from: z, reason: collision with root package name */
    public final int f12828z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12811h = false;
    public int y = -1;

    /* renamed from: F, reason: collision with root package name */
    public final ViewOnClickListenerC0022w f12805F = new ViewOnClickListenerC0022w(13, this);

    public C1669d(Context context, DialogC1670e dialogC1670e, Window window) {
        this.f12806a = context;
        this.f12807b = dialogC1670e;
        this.c = window;
        JD jd = new JD();
        jd.f5798b = new WeakReference(dialogC1670e);
        this.f12804E = jd;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1657a.f12637e, R.attr.alertDialogStyle, 0);
        this.f12828z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f12800A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f12801B = obtainStyledAttributes.getResourceId(7, 0);
        this.f12802C = obtainStyledAttributes.getResourceId(3, 0);
        this.f12803D = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogC1670e.a().d(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f12804E.obtainMessage(i4, onClickListener) : null;
        if (i4 == -3) {
            this.f12819p = charSequence;
            this.f12820q = obtainMessage;
        } else if (i4 == -2) {
            this.f12816m = charSequence;
            this.f12817n = obtainMessage;
        } else {
            if (i4 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f12813j = charSequence;
            this.f12814k = obtainMessage;
        }
    }
}
