package androidx.appcompat.widget;

import C0.ViewOnLayoutChangeListenerC0013m;
import H.A;
import N3.e;
import Y2.q;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e.AbstractC1657a;
import j.InterfaceC1720b;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.AbstractC1756a0;
import l.C1758b0;
import l.C1781n;
import l.o0;
import l.p0;
import l.q0;
import l.r0;
import l.s0;
import l.t0;
import l.u0;
import l.w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class SearchView extends AbstractC1756a0 implements InterfaceC1720b {

    /* renamed from: u0, reason: collision with root package name */
    public static final e f2555u0;

    /* renamed from: D, reason: collision with root package name */
    public final SearchAutoComplete f2556D;

    /* renamed from: E, reason: collision with root package name */
    public final View f2557E;

    /* renamed from: F, reason: collision with root package name */
    public final View f2558F;

    /* renamed from: G, reason: collision with root package name */
    public final View f2559G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f2560H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f2561I;

    /* renamed from: J, reason: collision with root package name */
    public final ImageView f2562J;

    /* renamed from: K, reason: collision with root package name */
    public final ImageView f2563K;

    /* renamed from: L, reason: collision with root package name */
    public final View f2564L;

    /* renamed from: M, reason: collision with root package name */
    public u0 f2565M;
    public final Rect N;

    /* renamed from: O, reason: collision with root package name */
    public final Rect f2566O;

    /* renamed from: P, reason: collision with root package name */
    public final int[] f2567P;

    /* renamed from: Q, reason: collision with root package name */
    public final int[] f2568Q;

    /* renamed from: R, reason: collision with root package name */
    public final ImageView f2569R;

    /* renamed from: S, reason: collision with root package name */
    public final Drawable f2570S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2571T;

    /* renamed from: U, reason: collision with root package name */
    public final int f2572U;

    /* renamed from: V, reason: collision with root package name */
    public final Intent f2573V;

    /* renamed from: W, reason: collision with root package name */
    public final Intent f2574W;

    /* renamed from: a0, reason: collision with root package name */
    public final CharSequence f2575a0;

    /* renamed from: b0, reason: collision with root package name */
    public View.OnFocusChangeListener f2576b0;

    /* renamed from: c0, reason: collision with root package name */
    public View.OnClickListener f2577c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2578d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f2579e0;

    /* renamed from: f0, reason: collision with root package name */
    public K.c f2580f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f2581g0;

    /* renamed from: h0, reason: collision with root package name */
    public CharSequence f2582h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f2583i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f2584j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f2585k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f2586l0;

    /* renamed from: m0, reason: collision with root package name */
    public CharSequence f2587m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2588n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f2589o0;

    /* renamed from: p0, reason: collision with root package name */
    public SearchableInfo f2590p0;

    /* renamed from: q0, reason: collision with root package name */
    public Bundle f2591q0;

    /* renamed from: r0, reason: collision with root package name */
    public final o0 f2592r0;

    /* renamed from: s0, reason: collision with root package name */
    public final o0 f2593s0;

    /* renamed from: t0, reason: collision with root package name */
    public final WeakHashMap f2594t0;

    /* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C1781n {

        /* renamed from: r, reason: collision with root package name */
        public int f2595r;

        /* renamed from: s, reason: collision with root package name */
        public SearchView f2596s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f2597t;

        /* renamed from: u, reason: collision with root package name */
        public final c f2598u;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2598u = new c(this);
            this.f2595r = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f2595r <= 0 || super.enoughToFilter();
        }

        @Override // l.C1781n, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2597t) {
                c cVar = this.f2598u;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i4, Rect rect) {
            super.onFocusChanged(z4, i4, rect);
            SearchView searchView = this.f2596s;
            searchView.w(searchView.f2579e0);
            searchView.post(searchView.f2592r0);
            if (searchView.f2556D.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2596s.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            Method method;
            super.onWindowFocusChanged(z4);
            if (z4 && this.f2596s.hasFocus() && getVisibility() == 0) {
                this.f2597t = true;
                Context context = getContext();
                e eVar = SearchView.f2555u0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f2555u0.c) == null) {
                    return;
                }
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f2598u;
            if (!z4) {
                this.f2597t = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2597t = true;
                    return;
                }
                this.f2597t = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2596s = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f2595r = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [N3.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            obj.f1234a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            obj.f1235b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            obj.c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f2555u0 = obj;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.N = new Rect();
        this.f2566O = new Rect();
        this.f2567P = new int[2];
        this.f2568Q = new int[2];
        this.f2592r0 = new o0(this, 0);
        this.f2593s0 = new o0(this, 1);
        this.f2594t0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        p0 p0Var = new p0(this);
        q qVar = new q(2, this);
        C1758b0 c1758b0 = new C1758b0(1, this);
        Y2.a aVar2 = new Y2.a(4, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.f12653u, i4, 0);
        q2.e eVar = new q2.e(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2556D = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2557E = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f2558F = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f2559G = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2560H = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2561I = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2562J = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2563K = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f2569R = imageView5;
        Drawable p3 = eVar.p(10);
        WeakHashMap weakHashMap = A.f779a;
        findViewById.setBackground(p3);
        findViewById2.setBackground(eVar.p(14));
        imageView.setImageDrawable(eVar.p(13));
        imageView2.setImageDrawable(eVar.p(7));
        imageView3.setImageDrawable(eVar.p(4));
        imageView4.setImageDrawable(eVar.p(16));
        imageView5.setImageDrawable(eVar.p(13));
        this.f2570S = eVar.p(12);
        android.support.v4.media.session.a.s(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f2571T = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f2572U = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(aVar2);
        searchAutoComplete.setOnEditorActionListener(p0Var);
        searchAutoComplete.setOnItemClickListener(qVar);
        searchAutoComplete.setOnItemSelectedListener(c1758b0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new Y2.b(2, this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f2575a0 = obtainStyledAttributes.getText(6);
        this.f2582h0 = obtainStyledAttributes.getText(11);
        int i5 = 3;
        int i6 = obtainStyledAttributes.getInt(3, -1);
        if (i6 != -1) {
            setImeOptions(i6);
        }
        int i7 = obtainStyledAttributes.getInt(2, -1);
        if (i7 != -1) {
            setInputType(i7);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        eVar.y();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2573V = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2574W = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2564L = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0013m(i5, this));
        }
        w(this.f2578d0);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f2556D;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f2584j0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2556D;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f2584j0 = false;
    }

    public int getImeOptions() {
        return this.f2556D.getImeOptions();
    }

    public int getInputType() {
        return this.f2556D.getInputType();
    }

    public int getMaxWidth() {
        return this.f2585k0;
    }

    public CharSequence getQuery() {
        return this.f2556D.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2582h0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2590p0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2575a0 : getContext().getText(this.f2590p0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2572U;
    }

    public int getSuggestionRowLayout() {
        return this.f2571T;
    }

    public K.c getSuggestionsAdapter() {
        return this.f2580f0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2587m0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2591q0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2590p0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2591q0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i4 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2556D;
        if (i4 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        e eVar = f2555u0;
        Method method = eVar.f1234a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = eVar.f1235b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.f2556D;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f2578d0) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i4) {
        int i5;
        String r4;
        Cursor cursor = this.f2580f0.f1039q;
        if (cursor != null && cursor.moveToPosition(i4)) {
            Intent intent = null;
            try {
                int i6 = w0.f13840M;
                String r5 = w0.r(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (r5 == null) {
                    r5 = this.f2590p0.getSuggestIntentAction();
                }
                if (r5 == null) {
                    r5 = "android.intent.action.SEARCH";
                }
                String r6 = w0.r(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (r6 == null) {
                    r6 = this.f2590p0.getSuggestIntentData();
                }
                if (r6 != null && (r4 = w0.r(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    r6 = r6 + "/" + Uri.encode(r4);
                }
                intent = j(r5, r6 == null ? null : Uri.parse(r6), w0.r(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), w0.r(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e4) {
                try {
                    i5 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i5 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i5 + " returned exception.", e4);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e5) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e5);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2556D;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i4) {
        Editable text = this.f2556D.getText();
        Cursor cursor = this.f2580f0.f1039q;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        String c = this.f2580f0.c(cursor);
        if (c != null) {
            setQuery(c);
        } else {
            setQuery(text);
        }
    }

    @Override // j.InterfaceC1720b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f2556D;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f2587m0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f2589o0);
        this.f2588n0 = false;
    }

    @Override // j.InterfaceC1720b
    public final void onActionViewExpanded() {
        if (this.f2588n0) {
            return;
        }
        this.f2588n0 = true;
        SearchAutoComplete searchAutoComplete = this.f2556D;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f2589o0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2592r0);
        post(this.f2593s0);
        super.onDetachedFromWindow();
    }

    @Override // l.AbstractC1756a0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            SearchAutoComplete searchAutoComplete = this.f2556D;
            int[] iArr = this.f2567P;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f2568Q;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.N;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i5;
            Rect rect2 = this.f2566O;
            rect2.set(i10, 0, i11, i12);
            u0 u0Var = this.f2565M;
            if (u0Var == null) {
                u0 u0Var2 = new u0(rect2, rect, searchAutoComplete);
                this.f2565M = u0Var2;
                setTouchDelegate(u0Var2);
            } else {
                u0Var.f13832b.set(rect2);
                Rect rect3 = u0Var.d;
                rect3.set(rect2);
                int i13 = -u0Var.f13833e;
                rect3.inset(i13, i13);
                u0Var.c.set(rect);
            }
        }
    }

    @Override // l.AbstractC1756a0, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f2579e0) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f2585k0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2585k0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f2585k0) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof t0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        t0 t0Var = (t0) parcelable;
        super.onRestoreInstanceState(t0Var.f1071o);
        w(t0Var.f13827q);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L.b, android.os.Parcelable, l.t0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new L.b(super.onSaveInstanceState());
        bVar.f13827q = this.f2579e0;
        return bVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f2592r0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.f2556D;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f2590p0 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean isEmpty = TextUtils.isEmpty(this.f2556D.getText());
        int i4 = (!isEmpty || (this.f2578d0 && !this.f2588n0)) ? 0 : 8;
        ImageView imageView = this.f2562J;
        imageView.setVisibility(i4);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        if (this.f2584j0 || !isFocusable()) {
            return false;
        }
        if (this.f2579e0) {
            return super.requestFocus(i4, rect);
        }
        boolean requestFocus = this.f2556D.requestFocus(i4, rect);
        if (requestFocus) {
            w(false);
        }
        return requestFocus;
    }

    public final void s() {
        int[] iArr = this.f2556D.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2558F.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2559G.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2591q0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.f2556D;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2577c0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f2578d0 == z4) {
            return;
        }
        this.f2578d0 = z4;
        w(z4);
        t();
    }

    public void setImeOptions(int i4) {
        this.f2556D.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f2556D.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f2585k0 = i4;
        requestLayout();
    }

    public void setOnCloseListener(q0 q0Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2576b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(r0 r0Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2577c0 = onClickListener;
    }

    public void setOnSuggestionListener(s0 s0Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2582h0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f2583i0 = z4;
        K.c cVar = this.f2580f0;
        if (cVar instanceof w0) {
            ((w0) cVar).f13845E = z4 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f2590p0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f2556D
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f2590p0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f2590p0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f2590p0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            K.c r7 = r6.f2580f0
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f2590p0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            l.w0 r7 = new l.w0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f2590p0
            java.util.WeakHashMap r5 = r6.f2594t0
            r7.<init>(r3, r6, r4, r5)
            r6.f2580f0 = r7
            r2.setAdapter(r7)
            K.c r7 = r6.f2580f0
            l.w0 r7 = (l.w0) r7
            boolean r3 = r6.f2583i0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f13845E = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.f2590p0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f2590p0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f2573V
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f2590p0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f2574W
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.f2586l0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.f2579e0
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f2581g0 = z4;
        w(this.f2579e0);
    }

    public void setSuggestionsAdapter(K.c cVar) {
        this.f2580f0 = cVar;
        this.f2556D.setAdapter(cVar);
    }

    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z4 = this.f2578d0;
        SearchAutoComplete searchAutoComplete = this.f2556D;
        if (z4 && (drawable = this.f2570S) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        this.f2559G.setVisibility(((this.f2581g0 || this.f2586l0) && !this.f2579e0 && (this.f2561I.getVisibility() == 0 || this.f2563K.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z4) {
        boolean z5 = this.f2581g0;
        this.f2561I.setVisibility((!z5 || !(z5 || this.f2586l0) || this.f2579e0 || !hasFocus() || (!z4 && this.f2586l0)) ? 8 : 0);
    }

    public final void w(boolean z4) {
        this.f2579e0 = z4;
        int i4 = 8;
        int i5 = z4 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f2556D.getText());
        this.f2560H.setVisibility(i5);
        v(!isEmpty);
        this.f2557E.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.f2569R;
        imageView.setVisibility((imageView.getDrawable() == null || this.f2578d0) ? 8 : 0);
        r();
        if (this.f2586l0 && !this.f2579e0 && isEmpty) {
            this.f2561I.setVisibility(8);
            i4 = 0;
        }
        this.f2563K.setVisibility(i4);
        u();
    }
}
