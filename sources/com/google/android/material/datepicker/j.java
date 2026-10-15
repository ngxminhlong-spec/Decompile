package com.google.android.material.datepicker;

import C0.ViewOnClickListenerC0022w;
import H.A;
import H.AbstractC0044t;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.material.internal.CheckableImageButton;
import g.AbstractC1678a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j extends DialogInterfaceOnCancelListenerC0154c {

    /* renamed from: A0, reason: collision with root package name */
    public V2.g f12387A0;

    /* renamed from: B0, reason: collision with root package name */
    public Button f12388B0;

    /* renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet f12389p0;

    /* renamed from: q0, reason: collision with root package name */
    public final LinkedHashSet f12390q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f12391r0;

    /* renamed from: s0, reason: collision with root package name */
    public q f12392s0;

    /* renamed from: t0, reason: collision with root package name */
    public b f12393t0;

    /* renamed from: u0, reason: collision with root package name */
    public i f12394u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f12395v0;

    /* renamed from: w0, reason: collision with root package name */
    public CharSequence f12396w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f12397x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f12398y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f12399z0;

    public j() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f12389p0 = new LinkedHashSet();
        this.f12390q0 = new LinkedHashSet();
    }

    public static int L(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b4 = u.b();
        b4.set(5, 1);
        Calendar a4 = u.a(b4);
        a4.get(2);
        a4.get(1);
        int maximum = a4.getMaximum(7);
        a4.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.format(a4.getTime());
        a4.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean M(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(B.N(R.attr.materialCalendarStyle, context, i.class.getCanonicalName()), new int[]{android.R.attr.windowFullscreen});
        boolean z4 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z4;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c, androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void A() {
        this.f12392s0.f12417g0.clear();
        super.A();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c
    public final Dialog K() {
        Context D4 = D();
        D();
        int i4 = this.f12391r0;
        if (i4 == 0) {
            throw null;
        }
        Dialog dialog = new Dialog(D4, i4);
        Context context = dialog.getContext();
        this.f12397x0 = M(context);
        int N = B.N(R.attr.colorSurface, context, j.class.getCanonicalName());
        V2.g gVar = new V2.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f12387A0 = gVar;
        gVar.g(context);
        this.f12387A0.i(ColorStateList.valueOf(N));
        V2.g gVar2 = this.f12387A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = A.f779a;
        gVar2.h(AbstractC0044t.d(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f12389p0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f12390q0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f2835R;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c, androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f2853s;
        }
        this.f12391r0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f12393t0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f12395v0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f12396w0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f12398y0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f12397x0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f12397x0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(L(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(L(context), -1));
            Resources resources = D().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i4 = m.f12408r;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i4 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i4) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = A.f779a;
        textView.setAccessibilityLiveRegion(1);
        this.f12399z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f12396w0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f12395v0);
        }
        this.f12399z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f12399z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC1678a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC1678a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f12399z0.setChecked(this.f12398y0 != 0);
        A.h(this.f12399z0, null);
        CheckableImageButton checkableImageButton2 = this.f12399z0;
        this.f12399z0.setContentDescription(checkableImageButton2.f12437q ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f12399z0.setOnClickListener(new ViewOnClickListenerC0022w(12, this));
        this.f12388B0 = (Button) inflate.findViewById(R.id.confirm_button);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c, androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void y(Bundle bundle) {
        super.y(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f12391r0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f12393t0;
        ?? obj = new Object();
        int i4 = a.f12358b;
        int i5 = a.f12358b;
        long j4 = bVar.f12360o.f12407u;
        long j5 = bVar.f12361p.f12407u;
        obj.f12359a = Long.valueOf(bVar.f12362q.f12407u);
        c cVar = bVar.f12363r;
        l lVar = this.f12394u0.f12380j0;
        if (lVar != null) {
            obj.f12359a = Long.valueOf(lVar.f12407u);
        }
        if (obj.f12359a == null) {
            Calendar b4 = u.b();
            b4.set(5, 1);
            Calendar a4 = u.a(b4);
            a4.get(2);
            a4.get(1);
            a4.getMaximum(7);
            a4.getActualMaximum(5);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            simpleDateFormat.format(a4.getTime());
            long timeInMillis = a4.getTimeInMillis();
            if (j4 > timeInMillis || timeInMillis > j5) {
                timeInMillis = j4;
            }
            obj.f12359a = Long.valueOf(timeInMillis);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        Calendar c = u.c(null);
        c.setTimeInMillis(j4);
        l lVar2 = new l(c);
        Calendar c2 = u.c(null);
        c2.setTimeInMillis(j5);
        l lVar3 = new l(c2);
        long longValue = obj.f12359a.longValue();
        Calendar c4 = u.c(null);
        c4.setTimeInMillis(longValue);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(lVar2, lVar3, new l(c4), (c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY")));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f12395v0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f12396w0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0154c, androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void z() {
        super.z();
        Dialog dialog = this.f2805l0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f12397x0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f12387A0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f12387A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f2805l0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new L2.a(dialog2, rect));
        }
        D();
        int i4 = this.f12391r0;
        if (i4 == 0) {
            throw null;
        }
        b bVar = this.f12393t0;
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f12362q);
        iVar.G(bundle);
        this.f12394u0 = iVar;
        q qVar = iVar;
        if (this.f12399z0.f12437q) {
            b bVar2 = this.f12393t0;
            q kVar = new k();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            kVar.G(bundle2);
            qVar = kVar;
        }
        this.f12392s0 = qVar;
        throw null;
    }
}
