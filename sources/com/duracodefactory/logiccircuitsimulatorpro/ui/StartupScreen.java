package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import o1.C1839O;
import o1.C1841Q;
import o1.InterfaceC1840P;
import o1.ViewOnClickListenerC1838N;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class StartupScreen extends FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final ArrayList f3708t = getStartupStates();

    /* renamed from: o, reason: collision with root package name */
    public ViewGroup f3709o;

    /* renamed from: p, reason: collision with root package name */
    public View f3710p;

    /* renamed from: q, reason: collision with root package name */
    public View f3711q;

    /* renamed from: r, reason: collision with root package name */
    public int f3712r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1840P f3713s;

    public StartupScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void a(StartupScreen startupScreen) {
        ViewGroup d = startupScreen.d((C1841Q) f3708t.get(startupScreen.f3712r));
        View childAt = startupScreen.f3709o.getChildAt(r0.getChildCount() - 1);
        int dimensionPixelSize = startupScreen.getResources().getDimensionPixelSize(R.dimen.welcome_image_size);
        startupScreen.f3709o.addView(d);
        d.setTranslationX(dimensionPixelSize);
        d.setAlpha(0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new C1839O(startupScreen, d, dimensionPixelSize, childAt, 0));
        ofFloat.start();
    }

    public static void b(StartupScreen startupScreen) {
        ViewGroup d = startupScreen.d((C1841Q) f3708t.get(startupScreen.f3712r));
        View childAt = startupScreen.f3709o.getChildAt(r0.getChildCount() - 1);
        int dimensionPixelSize = startupScreen.getResources().getDimensionPixelSize(R.dimen.welcome_image_size);
        startupScreen.f3709o.addView(d);
        d.setTranslationX(-dimensionPixelSize);
        d.setAlpha(0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new C1839O(startupScreen, d, dimensionPixelSize, childAt, 1));
        ofFloat.start();
    }

    public static void c(StartupScreen startupScreen) {
        if (startupScreen.f3712r == 0) {
            startupScreen.f3710p.animate().alpha(0.0f).setDuration(64L);
        } else if (startupScreen.f3710p.getAlpha() < 1.0f) {
            startupScreen.f3710p.animate().alpha(1.0f).setDuration(64L);
        }
        if (startupScreen.f3712r == 1) {
            startupScreen.f3711q.animate().alpha(1.0f).setDuration(64L);
        } else if (startupScreen.f3711q.getAlpha() > 0.0f) {
            startupScreen.f3711q.animate().alpha(0.0f).setDuration(64L);
        }
    }

    private static ArrayList<C1841Q> getStartupStates() {
        ArrayList<C1841Q> arrayList = new ArrayList<>();
        arrayList.add(new C1841Q(R.drawable.ic_logo_icon, R.string.welcome_1_t, R.string.welcome_1_d));
        arrayList.add(new C1841Q(R.drawable.ic_startup_second, R.string.privacy_policy, R.string.welcome_2_d));
        arrayList.add(new C1841Q(R.drawable.ic_startup_third, R.string.timediagrams_title, R.string.welcome_3_d));
        arrayList.add(new C1841Q(R.drawable.ic_startup_fourth, R.string.welcome_4_t, R.string.welcome_4_d));
        arrayList.add(new C1841Q(R.drawable.ic_startup_fifth, R.string.welcome_5_t, R.string.welcome_5_d));
        arrayList.add(new C1841Q(R.drawable.ic_startup_sixth, R.string.welcome_6_t, R.string.welcome_6_d));
        return arrayList;
    }

    public final ViewGroup d(C1841Q c1841q) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.welcome_item_entry, (ViewGroup) null);
        ((ImageView) viewGroup.findViewById(R.id.welcome_card_image)).setImageResource(c1841q.f14225a);
        ((TextView) viewGroup.findViewById(R.id.welcome_card_maintext)).setText(c1841q.f14226b);
        ((TextView) viewGroup.findViewById(R.id.welcome_card_secondarytext)).setText(c1841q.c);
        return viewGroup;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3709o = (ViewGroup) findViewById(R.id.welcome_card_container);
        findViewById(R.id.welcome_next_button).setOnClickListener(new ViewOnClickListenerC1838N(this, 0));
        View findViewById = findViewById(R.id.welcome_prev_button);
        this.f3710p = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC1838N(this, 1));
        this.f3711q = findViewById(R.id.welcome_links_container);
        this.f3709o.addView(d((C1841Q) f3708t.get(0)));
    }

    public void setListener(InterfaceC1840P interfaceC1840P) {
        this.f3713s = interfaceC1840P;
    }
}
